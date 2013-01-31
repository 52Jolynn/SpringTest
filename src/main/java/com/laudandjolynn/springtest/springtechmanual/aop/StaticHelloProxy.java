package com.laudandjolynn.springtest.springtechmanual.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author: Laud
 * @email: htd0324@gmail.com
 * @date: 2013-1-31 下午2:01:58
 * @copyright: www.armisi.com.cn
 */
public class StaticHelloProxy implements IHello {
	private final static Logger log = LoggerFactory
			.getLogger(StaticHelloProxy.class);
	private IHello hello;

	public StaticHelloProxy(IHello hello) {
		this.hello = hello;
	}

	@Override
	public void hello(String name) {
		log.debug("befor method invoke....");
		hello.hello(name);
		log.debug("after method invoke...");
	}

	@Override
	public void fight() throws Throwable {
		hello.fight();
	}

	@Override
	public void newbie() {
		hello.newbie();
	}

	@Override
	public void master() {
		hello.master();
	}

	@Override
	public void hhhh() {
		hello.hhhh();
	}
}
