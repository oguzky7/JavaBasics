package com.syntax.class03;

public class ShortHandOperators {

	public static void main(String[] args) {
		
		int num=100;
		num=num+100;
		
		System.out.println(num);	//200
		
		num=num+50;
		System.out.println(num);	//250
		
		// +=  -=  /=  *=  %=  shorthand operators
		
		num+=100;	//num=num+100
		System.out.println(num);	//350
		
		num-=10;	//num=num-10
		System.out.println(num);	//340
		
		num/=10;
		num*=2;
		
		System.out.println(num);	//68
		
		num%=2;
		System.out.println(num);	//0
		
		int a=10;
		int b=20;
		int c=30;
		
		a+=b;
		System.out.println(a);	//30
		
		a+=b+c;
		System.out.println(a);	//80
		
		a*=10;
		System.out.println(a);	//800
		
		
		
	}

}
