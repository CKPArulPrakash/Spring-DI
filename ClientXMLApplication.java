package com.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.consumer.MyXMLApplication;

public class ClientXMLApplication {
	public static void main(String args[])
	{
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		MyXMLApplication app=context.getBean(MyXMLApplication.class);
		app.processMessage("Hi Balaji","balaji@gmail.com");
		//close the context
		context.close();
	}

}
