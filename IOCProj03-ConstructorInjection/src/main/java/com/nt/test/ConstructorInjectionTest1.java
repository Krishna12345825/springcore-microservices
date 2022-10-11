//ConstructorInjectionTest.java
package com.nt.test;

import java.util.Date;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.beans.WishMessageGenerator;

public class ConstructorInjectionTest1 {

	public static void main(String[] args) {
		//Hold spring bean cfg file name and location   (ctrl+shift+o :: To import pkg)
		//FileSystemResource res=new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml");
		//FileSystemResource res=new FileSystemResource("G:\\Worskpaces\\Spring\\NTSPBMS615\\IOCProj03-ConstructorInjection\\src\\main\\java\\com\\nt\\cfgs\\applicationContext.xml");
         ClassPathResource res=new ClassPathResource("applicationContext.xml");
		//create IOC container (BeanFactory container)
		XmlBeanFactory factory=new XmlBeanFactory(res);
		//get Target spring bean class object
		WishMessageGenerator  generator=factory.getBean("wmg",WishMessageGenerator.class);
		//invoke the b.method
		String result=generator.generateMessage("raja");
		System.out.println("Wish Message is ::"+result); 

	}//main
}//class
