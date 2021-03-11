package cn.winstone.stream;


import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

/**
 * @author Winstone
 * @date 2021/3/5 - 5:02 下午
 */
@Slf4j
@Component
@EnableBinding(StreamClient.class) //上边定义的接口文件
public class StreamReceiver {
	@StreamListener(StreamClient.OUTPUT)
	public void processOutput(Object message){
		log.info("StreamReceiver output : {}", message);
	}
}
