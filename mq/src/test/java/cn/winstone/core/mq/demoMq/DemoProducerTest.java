package cn.winstone.core.mq.demoMq;

import cn.winstone.core.CoreApiApplication;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author Winstone
 * @date 2021/3/9 - 8:58 下午
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = CoreApiApplication.class)
public class DemoProducerTest extends TestCase {
	@Autowired
	private DemoProducer demoProducer;

	@Test
	public void send() {
		for (int i = 0; i < 100; i++) {
			demoProducer.send("第" + i + "条消息");
		}
	}
}
