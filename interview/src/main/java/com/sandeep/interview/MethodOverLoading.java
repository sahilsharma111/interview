package com.sandeep.interview;

public class MethodOverLoading {
	
	public static void main(String[] args) {
		show(12,1l);
		show(null);
	}

	public static void show(long a,int b){
		System.out.println("int:"+a);
	}
	public static void show(int a,long b){
		System.out.println("long:"+a);
	}
	
	public static void show(A obj){
		System.out.println("Objct");
	}
	public static void show(B str){
		System.out.println("String");
	}
	
	
	
	class A{
		
		
	}
	class B extends A{
		
	}
}
