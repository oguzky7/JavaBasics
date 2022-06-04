package com.syntax.reviewclass5;

import java.util.Scanner;

public class ArraysDemo {
	public static void main(String[] args) {

	    Scanner input=new Scanner(System.in);
	    
	    String[] integers=new String[5];
	  
			
			for(int i = 0; i<integers.length; i++) {
	      integers[i]=input.next();
						}
	    
	    for(int i = 0; i<integers.length; i++) {
	    
	    System.out.println(integers[i]);
	      }
			
			input.close();
	    
			
			}
	  
	 
	    
	  
	 
	    
	
}
