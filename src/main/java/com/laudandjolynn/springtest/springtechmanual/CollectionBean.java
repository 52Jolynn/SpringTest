package com.laudandjolynn.springtest.springtechmanual;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: Laud
 * @email: htd0324@gmail.com
 * @date: 2013-1-31 上午11:08:51
 * @copyright: www.armisi.com.cn
 */
public class CollectionBean {
	private final static Logger log = LoggerFactory
			.getLogger(CollectionBean.class);
	private String[] someStrArray;
	private SomeBean[] someObjArray;
	private List<String> someList;
	private Map<String, String> someMap;

	public String[] getSomeStrArray() {
		return someStrArray;
	}

	public void setSomeStrArray(String[] someStrArray) {
		this.someStrArray = someStrArray;
	}

	public SomeBean[] getSomeObjArray() {
		return someObjArray;
	}

	public void setSomeObjArray(SomeBean[] someObjArray) {
		this.someObjArray = someObjArray;
	}

	public List<String> getSomeList() {
		return someList;
	}

	public void setSomeList(List<String> someList) {
		this.someList = someList;
	}

	public Map<String, String> getSomeMap() {
		return someMap;
	}

	public void setSomeMap(Map<String, String> someMap) {
		this.someMap = someMap;
	}

	@Override
	public String toString() {
		return "[someStrArray=" + Arrays.deepToString(someStrArray)
				+ ", someObjArray=" + Arrays.deepToString(someObjArray)
				+ ", someList=" + someList + ", someMap=" + someMap + "]";
	}

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		CollectionBean collectionBean = (CollectionBean) context
				.getBean("collectionBean");
		log.debug(collectionBean.toString());
	}
}
