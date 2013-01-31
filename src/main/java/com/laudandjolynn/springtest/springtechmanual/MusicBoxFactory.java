package com.laudandjolynn.springtest.springtechmanual;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: Laud
 * @email: htd0324@gmail.com
 * @date: 2013-1-31 上午10:08:11
 * @copyright: www.armisi.com.cn
 */
public class MusicBoxFactory {
	private final static Logger log = LoggerFactory
			.getLogger(MusicBoxFactory.class);

	public static IMusicBox createMusicBox() {
		return new IMusicBox() {

			@Override
			public void play() {
				log.debug("播放钢琴音乐...");
			}
		};
	}

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		IMusicBox musicBox = (IMusicBox) context.getBean("musicBox");
		musicBox.play();
	}
}
