package com.laudandjolynn.springtest.springtechmanual;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: Laud
 * @email: htd0324@gmail.com
 * @date: 2013-1-31 下午1:40:00
 * @copyright: www.armisi.com.cn
 */
public class InternationalDemo {
	private final static Logger log = LoggerFactory
			.getLogger(InternationalDemo.class);

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		log.debug(context.getMessage("Company", null, Locale.US));
		log.debug(context.getMessage("Company", null, Locale.CHINA));
		log.debug(context.getMessage("Company", null, Locale.TAIWAN));
	}
}
