package com.laudandjolynn.springtest.springtechmanual.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author: Laud
 * @email: htd0324@gmail.com
 * @date: 2013-1-31 下午2:08:42
 * @copyright: www.armisi.com.cn
 */
public class LogHandler implements InvocationHandler {
	private final static Logger log = LoggerFactory.getLogger(LogHandler.class);

	private Object delegate;

	public Object bind(Object delegate) {
		this.delegate = delegate;
		Class<?> clazz = delegate.getClass();
		return Proxy.newProxyInstance(clazz.getClassLoader(),
				clazz.getInterfaces(), this);
	}

	@Override
	public Object invoke(Object arg0, Method arg1, Object[] arg2)
			throws Throwable {
		log.debug("before method invoke...");
		Object result = arg1.invoke(delegate, arg2);
		log.debug("after method invoke...");
		return result;
	}

}
