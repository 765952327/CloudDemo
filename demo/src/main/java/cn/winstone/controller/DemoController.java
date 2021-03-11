package cn.winstone.controller;

import cn.winstone.stream.StreamClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.messaging.support.MessageBuilder;

import java.util.Date;

/**
 * @author Winstone
 * @date 2021/3/4 - 3:43 下午
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

	@Autowired
	private StreamClient streamClient;

	@GetMapping("/date")
	public String getDate(){
		return new String(new Date().toString());
	}

	@GetMapping("/sendMessage")
	public void sendMessage(){
		String message = "send to mq: now is " + new Date();
		streamClient.output().send(MessageBuilder.withPayload(message).build());
	}

}
