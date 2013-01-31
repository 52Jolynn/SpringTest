package com.laudandjolynn.springtest.springtechmanual.aop;

/**
 * @author: Laud
 * @email: htd0324@gmail.com
 * @date: 2013-1-31 下午2:13:59
 * @copyright: www.armisi.com.cn
 */
public class DynamicProxyDemo {
	public static void main(String[] args) {
		IHello hello = new HelloSpeaker();
		LogHandler handler = new LogHandler();
		IHello proxy = (IHello) handler.bind(hello);
		proxy.hello("Laud");
	}
}
