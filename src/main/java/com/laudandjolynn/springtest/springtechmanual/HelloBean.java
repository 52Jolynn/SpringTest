package com.laudandjolynn.springtest.springtechmanual;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: Laud
 * @email: htd0324@gmail.com
 * @date: 2013-1-31 上午9:27:42
 * @copyright: www.armisi.com.cn
 */
public class HelloBean {
	private final static Logger log = LoggerFactory.getLogger(HelloBean.class);
	private String helloWorld;
	private String author;
	private String email;

	public String getHelloWorld() {
		return helloWorld;
	}

	public void setHelloWorld(String helloWorld) {
		this.helloWorld = helloWorld;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "[helloWorld=" + helloWorld + ", author=" + author + ", email="
				+ email + "]";
	}

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		HelloBean helloBean = (HelloBean) context.getBean("helloBean");
		log.debug(helloBean.toString());
	}

}
