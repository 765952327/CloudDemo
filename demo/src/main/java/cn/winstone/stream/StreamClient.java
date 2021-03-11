package cn.winstone.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * @author Winstone
 * @date 2021/3/5 - 5:00 下午
 */
public interface StreamClient {
	String INPUT = "myMessageInput";

	String OUTPUT = "myMessageOutput";

	//接收消息，使用SubscribableChannel
	@Input(StreamClient.INPUT)
	SubscribableChannel input();

	//发送消息，使用MessageChannel
	@Output(StreamClient.OUTPUT)
	MessageChannel output();
}
