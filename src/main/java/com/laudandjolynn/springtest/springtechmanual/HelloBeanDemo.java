package com.laudandjolynn.springtest.springtechmanual;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * @author: Laud
 * @email: htd0324@gmail.com
 * @date: 2013-1-31 上午9:33:37
 * @copyright: www.armisi.com.cn
 */
@SuppressWarnings("deprecation")
public class HelloBeanDemo {
	private final static Logger log = LoggerFactory
			.getLogger(HelloBeanDemo.class);

	public static void main(String[] args) {
		Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		HelloBean helloBean = (HelloBean) factory.getBean("helloBean");
		log.debug(helloBean.getHelloWorld());

		HelloBean2 helloBean2 = (HelloBean2) factory.getBean("helloBean2");
		log.debug(helloBean2.toString());
	}
}
