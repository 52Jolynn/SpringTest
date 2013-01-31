package com.laudandjolynn.springtest.springtechmanual;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author: Laud
 * @email: htd0324@gmail.com
 * @date: 2013-1-31 下午12:45:31
 * @copyright: www.armisi.com.cn
 */
public abstract class MessageManager {
	private final static Logger log = LoggerFactory
			.getLogger(MessageManager.class);

	public void display() {
		Message message = createMessage();
		log.debug(message.toString());
	}

	public abstract Message createMessage();
}
