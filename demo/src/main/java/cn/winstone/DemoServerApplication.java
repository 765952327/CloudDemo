package cn.winstone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Winstone
 * @date 2021/3/4 - 3:31 下午
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "demo-server")
@EnableFeignClients
public class DemoServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoServerApplication.class,args);
	}
}
