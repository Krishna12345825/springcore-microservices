package com.nt.test;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Cricketer;

public class DependencyLookupTest {

	public static void main(String[] args) {
		//create IOC container
	    ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
	    //get target class object
	    Cricketer palyer=ctx.getBean("cktr",Cricketer.class);
	    System.out.println(palyer.getClass()+"   "+palyer.getClass().getSuperclass()+"   "+Arrays.toString(palyer.getClass().getDeclaredMethods()));
	    //invoke methods
	     palyer.batting();
	     palyer.batting();
	     palyer.bowling();
	     palyer.fielding();
	}//main
}//class
