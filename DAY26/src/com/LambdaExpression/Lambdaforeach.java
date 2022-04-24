package com.LambdaExpression;

import java.util.LinkedList;

public class Lambdaforeach {

	public static void main(String[] args) 
	{
	LinkedList<String> ll=new LinkedList<String>();
	ll.add("janhavi");
	ll.add("nehal");
	ll.add("nikita");
	ll.add("ashu");
	ll.forEach((n)->{System.out.println(n);});
	

	

	}
}


