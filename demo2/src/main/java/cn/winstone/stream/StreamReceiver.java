package cn.winstone.stream;

/**
 * @author Winstone
 * @date 2021/3/5 - 6:00 下午
 */

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@EnableBinding(StreamClient.class) //上边定义的接口文件
public class StreamReceiver {
	@StreamListener(StreamClient.U)
	public void processOutput(Object message){
		log.info("DEMO 2 StreamReceiver output : {}", message);
	}
}