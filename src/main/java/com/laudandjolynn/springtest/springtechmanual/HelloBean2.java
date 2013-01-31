package com.laudandjolynn.springtest.springtechmanual;

/**
 * @author: Laud
 * @email: htd0324@gmail.com
 * @date: 2013-1-31 上午10:46:51
 * @copyright: www.armisi.com.cn
 */
public class HelloBean2 {
	private String name;
	private String helloWorld;

	public HelloBean2() {
	}

	public HelloBean2(String name, String helloWorld) {
		this.name = name;
		this.helloWorld = helloWorld;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHelloWorld() {
		return helloWorld;
	}

	public void setHelloWorld(String helloWorld) {
		this.helloWorld = helloWorld;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", helloWorld=" + helloWorld + "]";
	}
}
