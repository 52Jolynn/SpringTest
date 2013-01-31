package com.laudandjolynn.springtest.springtechmanual;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: Laud
 * @email: htd0324@gmail.com
 * @date: 2013-1-31 上午10:30:34
 * @copyright: www.armisi.com.cn
 */
public class SomeBean implements BeanNameAware {
	private final static Logger log = LoggerFactory.getLogger(SomeBean.class);
	private String name;
	private int age;
	private String beanName;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", age=" + age + ", beanName=" + beanName
				+ "]";
	}

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		SomeBean someBean = (SomeBean) context.getBean("someBean");
		log.debug(someBean.toString());
	}

	@Override
	public void setBeanName(String name) {
		this.beanName = name;
	}
}
