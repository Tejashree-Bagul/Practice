//WAP TO PRINT THE SQUARE OF THE EVEN DIGITS OF THE  GIVEN NUMBER . NUM=942111423==> 4 16 4 16
package com.practice;

public class WhileSquareDemo5 {

	public static void main(String[] args) {
		
        int num = 942111423;
        while(num != 0) {
        	
        	int rem = num% 10;
        	if(rem % 2 ==0) {
        		
        		System.out.println(rem * rem);
        	}
        	num = num / 10;
        }
        System.out.println(" ");
	}

}
