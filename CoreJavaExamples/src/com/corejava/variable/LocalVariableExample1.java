package com.corejava.variable;

public class LocalVariableExample1 {

	public static void main(String[] args) {
		int x=10;
		for(int j=0;j<x;j++) {
			j=j+x;
			System.out.println(x+"-----"+j);
		}
		
	}
	

}
