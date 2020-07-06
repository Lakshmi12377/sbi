package com.corejava.variable;

public class InstanceVariableExample1 {
		
	int x=10;
	public static void main(String[] args) {
		InstanceVariableExample1 i=new InstanceVariableExample1();
		System.out.println(i.x);
		i.m1();
		
	}
	public void m1() {
		System.out.println(x);
	}

}
