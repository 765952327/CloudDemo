package cn.winstone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Winstone
 * @date 2021/3/4 - 3:31 下午
 */
@SpringBootApplication
@EnableEurekaClient
public class DemoServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoServerApplication.class,args);
	}
}
