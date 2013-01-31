package com.laudandjolynn.springtest.springtechmanual;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * @author: Laud
 * @email: htd0324@gmail.com
 * @date: 2013-1-31 上午9:44:50
 * @copyright: www.armisi.com.cn
 */
@SuppressWarnings("deprecation")
public class DeviceWritterBusiness {
	private IDeviceWritter writter = null;

	public IDeviceWritter getWritter() {
		return writter;
	}

	public void setWritter(IDeviceWritter writter) {
		this.writter = writter;
	}

	public void save() {
		if (writter == null) {
			throw new IllegalArgumentException("DeviceWritter needed...");
		}

		writter.saveToDevice();
	}

	public static void main(String[] args) {
		Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		DeviceWritterBusiness business = (DeviceWritterBusiness) factory
				.getBean("deviceWritterBusiness");
		business.save();
	}
}
