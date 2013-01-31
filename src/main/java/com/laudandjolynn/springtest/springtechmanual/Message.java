package com.laudandjolynn.springtest.springtechmanual;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: Laud
 * @email: htd0324@gmail.com
 * @date: 2013-1-31 下午12:45:55
 * @copyright: www.armisi.com.cn
 */
public class Message {
	private final static Logger log = LoggerFactory.getLogger(Message.class);
	private String sysMessage;

	public Message() {
		this.sysMessage = "系统资讯：" + new Date().toString();
	}

	public String getSysMessage() {
		return sysMessage;
	}

	public void setSysMessage(String sysMessage) {
		this.sysMessage = sysMessage;
	}

	@Override
	public String toString() {
		return "[sysMessage=" + sysMessage + "]";
	}

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		MessageManager messageManager = (MessageManager) context
				.getBean("messageManager");
		try {
			messageManager.display();
			Thread.sleep(1000);
			messageManager.display();
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			log.error(e.getMessage(), e);
		}
	}
}
