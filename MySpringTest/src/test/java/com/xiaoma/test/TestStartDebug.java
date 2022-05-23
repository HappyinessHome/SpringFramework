package com.xiaoma.test;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class TestStartDebug {
	@Test
	public void testxmlapplicaton(){
		ClassPathXmlApplicationContext xmlApplicationContext=new ClassPathXmlApplicationContext("applicationcontext.xml");
		Object testBean = xmlApplicationContext.getBean("testBean");
		System.out.println(testBean.toString());
	}
	@Test
	public void test(){
		Arrays.stream(new int[10]).forEach(num->{
			System.out.println(num++);
		});
	}

}
