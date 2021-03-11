package cn.winstone.core.mq.demoMq;

import cn.winstone.core.mq.Producer;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Winstone
 * @date 2021/3/9 - 8:53 下午
 */
@Component
public class DemoProducer implements Producer<String> {
	@Autowired
	private AmqpTemplate amqpTemplate;

	@Override
	public void send(String s) {
		amqpTemplate.convertAndSend("demoQueue",s);
	}
}
