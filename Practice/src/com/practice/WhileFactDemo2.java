//Find factorial of the given number. num=6
package com.practice;

public class WhileFactDemo2 {

	public static void main(String[] args) {
		
	   int num =6;
	   int fact = 1;
	   int i = 1;
	   while(i <= 6) {
		   fact = fact*i;
		   i++;
	   }
       System.out.println("Factorial of 6 is " + fact);
	}

}
