package com.laudandjolynn.springtest.springtechmanual.aop;

import java.lang.reflect.Method;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.MethodBeforeAdvice;

/**
 * @author: Laud
 * @email: htd0324@gmail.com
 * @date: 2013-1-31 下午2:31:30
 * @copyright: www.armisi.com.cn
 */
public class LogBeforeAdvice implements MethodBeforeAdvice {
	private final static Logger log = LoggerFactory
			.getLogger(LogBeforeAdvice.class);

	@Override
	public void before(Method method, Object[] args, Object target)
			throws Throwable {
		log.debug("method starts:" + method);
	}
}
