package cn.winstone.controller;

import cn.winstone.feignclient.FeignClientService;
import cn.winstone.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Winstone
 * @date 2021/3/4 - 4:00 下午
 */
@RequestMapping("/demo2")
@RestController
public class DemoController {
	@Autowired
	FeignClientService feignClientService;
	@Autowired
	DemoService demoService;
	@GetMapping("/date")
	public String getDate(){
		return "@  " + feignClientService.getDate();
	}

	@GetMapping("/ok")
	public String ok(){
		return demoService.oK(1);
	}

	@GetMapping("/out")
	public String out(){
		return demoService.timeOut(1);
	}
}
