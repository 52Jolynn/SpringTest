package com.laudandjolynn.springtest.springtechmanual.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author: Laud
 * @email: htd0324@gmail.com
 * @date: 2013-1-31 下午4:07:41
 * @copyright: www.armisi.com.cn
 */
@Aspect
public class LogBeforeAdviceAnnotation {
	private final static Logger log = LoggerFactory
			.getLogger(LogBeforeAdvice.class);

	@Before("execution(* com.laudandjolynn.springtest.springtechmanual.aop.IHello.hhhh())")
	public void before(JoinPoint joinPoint) throws Throwable {
		log.debug("method starts... 呵呵！");
	}

	@Before("execution(* com.laudandjolynn.springtest.springtechmanual.aop.IHello.hello(*)) && args(name)")
	public void before2(JoinPoint joinPoint, String name) {
		log.debug("喲喲，" + name);
	}

	@Before("execution(* com.laudandjolynn.springtest.springtechmanual.aop.IHello.hello(*))")
	public void before3(JoinPoint joinPoint) throws Throwable {
		Object[] args = joinPoint.getArgs();
		log.debug("喂喂，" + args[0].toString());
	}
}
