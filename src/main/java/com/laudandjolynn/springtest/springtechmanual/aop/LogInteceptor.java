package com.laudandjolynn.springtest.springtechmanual.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author: Laud
 * @email: htd0324@gmail.com
 * @date: 2013-1-31 下午3:01:55
 * @copyright: www.armisi.com.cn
 */
public class LogInteceptor implements MethodInterceptor {
	private final static Logger log = LoggerFactory
			.getLogger(LogInteceptor.class);

	@Override
	public Object invoke(MethodInvocation arg0) throws Throwable {
		log.debug("method starts...");
		Object result = arg0.proceed();
		log.debug("method ends...");
		return result;
	}

}
