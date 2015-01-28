package com.csh.spring.learn;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloTest {


	@Test
	public void testHelloWorld(){
		ApplicationContext app=new ClassPathXmlApplicationContext("spring/helloworld.xml");
//		HelloApi api=app.getBean("hello", HelloImpl.class);
//		api.sayHello();
//		HelloApi apiname=app.getBean("hello_name", HelloImpl.class);
//		apiname.sayName();
		HelloApi impl21=app.getBean("impl2_1",HelloImpl2.class);
		impl21.sayHello();
		HelloApi impl2=app.getBean("impl2",HelloImpl2.class);
		impl2.sayHello();
	}
}
