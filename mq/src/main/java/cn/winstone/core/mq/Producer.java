package cn.winstone.core.mq;

/**
 * 生产者
 * @author Winstone
 * @date 2021/3/9 - 8:29 下午
 */
public interface Producer<T> {
	void send(T t);
}
