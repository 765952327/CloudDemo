package cn.winstone.core.mq;

/**
 * 接收者
 * @author Winstone
 * @date 2021/3/9 - 8:50 下午
 */
public interface Receiver<T> {

	void receive(T t);
}
