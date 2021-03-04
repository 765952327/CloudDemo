package cn.winstone.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Winstone
 * @date 2021/3/4 - 3:55 下午
 */
@ComponentScan
@FeignClient(value = "demo-server")
public interface FeignClientService {
	@GetMapping("/demo/date")
	public String getDate();
}
