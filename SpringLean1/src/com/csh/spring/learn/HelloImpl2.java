package com.csh.spring.learn;

public class HelloImpl2 implements HelloApi {

	private String mName;

	public HelloImpl2(String name) {
		mName = name;
	}
	public HelloImpl2(int name,int name1) {
		mName = (name+name1)+"";
	}
	public HelloImpl2(){
		mName="impl2默认构造函数";
	}
	@Override
	public void sayHello() {
		System.out.println(mName);

	}

	@Override
	public void sayName() {
		// TODO Auto-generated method stub

	}

}
