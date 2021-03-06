package cn.winstone.service;

import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author Winstone
 * @date 2021/3/4 - 4:26 下午
 */
@Service
public class DemoService {
	/**
	 * 正常访问
	 *
	 * @param id
	 * @return
	 */
	public String oK(Integer id) {
		return "线程池:" + Thread.currentThread().getName() + " paymentInfo_OK,id:" + id + "\t" + "O(∩_∩)O哈哈~";
	}

	/**
	 * 超时访问
	 *
	 * @param id
	 * @return
	 */
	public String timeOut(Integer id) {
		int timeNumber = 3;
		try {
			// 暂停3秒钟
			TimeUnit.SECONDS.sleep(timeNumber);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return "线程池:" + Thread.currentThread().getName() + " paymentInfo_TimeOut,id:" + id + "\t" +
				"O(∩_∩)O哈哈~  耗时(秒)" + timeNumber;
	}
}
