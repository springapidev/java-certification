package com.coderbd.day1;

public class HelloWorld {
	
	private static String msg="Hello World";
	
	
	public static void main(String [] args){
		
		//System.out.println("Message: "+displayMsg());
		//String ms=displayMsg();
		//System.out.println("Message: "+ms);
		
		//displayMsg(msg);
		
		System.out.println("Message: "+displayMsg(msg));
	}
	
	//Single line comment
	
	/*
	Multiple lines comments
	public static void displayMsg(){

	System.out.println("Message: "+msg);	
		
	}
	*/
	/*
	public static String displayMsg(){

	return msg;	
		
	}
	*/
	/*
	public static void displayMsg(String message){

	System.out.println("Message: "+message);
		
	}
	*/
	
	
	public static String displayMsg(String message){

	return message;
		
	}
	
	
}