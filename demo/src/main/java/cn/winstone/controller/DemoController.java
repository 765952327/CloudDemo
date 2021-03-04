package cn.winstone.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author Winstone
 * @date 2021/3/4 - 3:43 下午
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

	@GetMapping("/date")
	public String getDate(){
		return new String(new Date().toString());
	}

}
