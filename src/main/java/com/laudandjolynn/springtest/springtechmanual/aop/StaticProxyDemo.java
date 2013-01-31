package com.laudandjolynn.springtest.springtechmanual.aop;

/**
 * @author: Laud
 * @email: htd0324@gmail.com
 * @date: 2013-1-31 下午2:06:27
 * @copyright: www.armisi.com.cn
 */
public class StaticProxyDemo {
	public static void main(String[] args) {
		IHello hello = new HelloSpeaker();
		StaticHelloProxy proxy = new StaticHelloProxy(hello);
		proxy.hello("Laud");
	}
}
