//WAP TO COUNT THE DIGITS OF THE GIVEN NUMBER---> NUM=942111423 COUNT = 9 
package com.practice;

public class WhileCountDemo3 {

	public static void main(String[] args) {
		
		int num = 942111423;
		int count =0;
		
		while(num !=0 ) {
			
			num = num/10;
			count++;
		}
        System.out.println("Count of the number is " + count);
	}

}
