package com.laudandjolynn.springtest.springtechmanual.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: Laud
 * @email: htd0324@gmail.com
 * @date: 2013-1-31 下午2:48:33
 * @copyright: www.armisi.com.cn
 */
public class SpringAopDemo {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		IHello helloProxy = (IHello) context.getBean("helloSpeakerProxy");
		helloProxy.hello("Laud");
		try {
			helloProxy.fight();
		} catch (Throwable e) {
		}

		IHello helloProxy2 = (IHello) context.getBean("helloSpeakerProxy2");
		helloProxy2.hello("Laud");

		IHello helloProxy3 = (IHello) context.getBean("helloSpeakerProxy3");
		helloProxy3.newbie();

		IHello helloSpeaker = (IHello) context.getBean("helloSpeaker");
		helloSpeaker.master();
		helloSpeaker.hhhh();
	}
}
