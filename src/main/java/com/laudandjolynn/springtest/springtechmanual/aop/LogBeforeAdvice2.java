package com.laudandjolynn.springtest.springtechmanual.aop;

import org.aspectj.lang.JoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author: Laud
 * @email: htd0324@gmail.com
 * @date: 2013-1-31 下午4:06:30
 * @copyright: www.armisi.com.cn
 */
public class LogBeforeAdvice2 {
	private final static Logger log = LoggerFactory
			.getLogger(LogBeforeAdvice.class);

	public void before(JoinPoint joinPoint) throws Throwable {
		log.debug("method starts... 哈哈！");
	}
}
