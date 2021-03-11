package cn.winstone.stream;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * @author Winstone
 * @date 2021/3/5 - 5:58 下午
 */
public interface StreamClient {
	String U = "myMessageOutput";

	@Output(StreamClient.U)
	MessageChannel output();
}
