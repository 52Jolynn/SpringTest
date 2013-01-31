package com.laudandjolynn.springtest.springtechmanual.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author: Laud
 * @email: htd0324@gmail.com
 * @date: 2013-1-31 下午2:00:57
 * @copyright: www.armisi.com.cn
 */
public class HelloSpeaker implements IHello {
	private final static Logger log = LoggerFactory
			.getLogger(HelloSpeaker.class);

	@Override
	public void hello(String name) {
		log.debug("Hello " + name);
	}

	@Override
	public void fight() throws Throwable {
		log.debug("Fight!");
		throw new SecurityException("不准打架！");
	}

	@Override
	public void newbie() {
		log.debug("newbie");
	}

	@Override
	public void master() {
		log.debug("master");
	}

	@Override
	public void hhhh() {
		log.debug("hhhh");
	}

}
