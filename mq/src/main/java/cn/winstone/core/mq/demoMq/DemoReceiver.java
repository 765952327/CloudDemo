package cn.winstone.core.mq.demoMq;

import cn.winstone.core.mq.Receiver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author Winstone
 * @date 2021/3/9 - 8:52 下午
 */
@Slf4j
@Component
public class DemoReceiver implements Receiver<String> {

	@Override
	@RabbitListener(queues = "demoQueue")
	public void receive(String s) {
		log.info("DemoReceiver: {}", s);
	}
}
