package com.laudandjolynn.springtest.springtechmanual.aop;

import java.lang.reflect.Method;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.ThrowsAdvice;

/**
 * @author: Laud
 * @email: htd0324@gmail.com
 * @date: 2013-1-31 下午3:10:52
 * @copyright: www.armisi.com.cn
 */
public class SomeThrowAdvice implements ThrowsAdvice {
	private final static Logger log = LoggerFactory
			.getLogger(SomeThrowAdvice.class);

	public void afterThrowing(Method method, Object[] args, Object target,
			Throwable subclass) {
		log.error("发生异常！");
		log.error(subclass.getMessage(), subclass);
	}
}
