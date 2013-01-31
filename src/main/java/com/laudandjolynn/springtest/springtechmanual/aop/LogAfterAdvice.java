package com.laudandjolynn.springtest.springtechmanual.aop;

import java.lang.reflect.Method;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.AfterReturningAdvice;

/**
 * @author: Laud
 * @email: htd0324@gmail.com
 * @date: 2013-1-31 下午2:56:02
 * @copyright: www.armisi.com.cn
 */
public class LogAfterAdvice implements AfterReturningAdvice {
	private final static Logger log = LoggerFactory
			.getLogger(LogAfterAdvice.class);

	@Override
	public void afterReturning(Object returnValue, Method method,
			Object[] args, Object target) throws Throwable {
		log.debug("method ends:" + method);
	}

}
