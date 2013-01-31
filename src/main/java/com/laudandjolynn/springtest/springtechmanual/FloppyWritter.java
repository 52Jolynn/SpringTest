package com.laudandjolynn.springtest.springtechmanual;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author: Laud
 * @email: htd0324@gmail.com
 * @date: 2013-1-31 上午9:43:06
 * @copyright: www.armisi.com.cn
 */
public class FloppyWritter implements IDeviceWritter {
	private final static Logger log = LoggerFactory
			.getLogger(FloppyWritter.class);

	@Override
	public void saveToDevice() {
		log.debug("保存至软盘...");
	}

}
