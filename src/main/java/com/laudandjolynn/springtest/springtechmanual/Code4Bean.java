package com.laudandjolynn.springtest.springtechmanual;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * @author: Laud
 * @email: htd0324@gmail.com
 * @date: 2013-1-31 下午12:59:49
 * @copyright: www.armisi.com.cn
 */
public class Code4Bean {
	private final static Logger log = LoggerFactory.getLogger(Code4Bean.class);

	public static void main(String[] args) {
		MutablePropertyValues properties = new MutablePropertyValues();
		properties.addPropertyValue("helloWorld", "Hello! Justin!");
		RootBeanDefinition definition = new RootBeanDefinition(HelloBean.class);
		definition.setPropertyValues(properties);
		BeanDefinitionRegistry reg = new DefaultListableBeanFactory();
		reg.registerBeanDefinition("helloBean", definition);
		BeanFactory factory = (BeanFactory) reg;
		HelloBean hello = (HelloBean) factory.getBean("helloBean");
		log.debug(hello.toString());
	}
}
