package com.services;

public class TwitterService implements MessageService {
	public boolean sendMessage(String msg,String rec) {
		System.out.println("Twitter Message Sent to "+rec+"With Message="+msg);
		return true;
	}

}
