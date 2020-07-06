package com.corejava.variable;

public class StaticVariableExample2 {
	int x=10;
	static int y=20;
	public static void main(String[] args) {
		StaticVariableExample2 s1=new StaticVariableExample2();
		s1.x=888;
		s1.y=999;
		StaticVariableExample2 s2=new StaticVariableExample2();
		System.out.println(s2.x+"----------"+s2.y);
	}

}
