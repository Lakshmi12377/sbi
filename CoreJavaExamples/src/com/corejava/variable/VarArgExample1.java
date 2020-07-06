package com.corejava.variable;



public class VarArgExample1 {
	public static void m1(int...x) {
		for(int y:x)
		System.out.println("Var Arg: "+y);
	}
	public static void main(String[] args) {
		m1();
		m1(10,20);
		m1(10,20,30);
	}

}
