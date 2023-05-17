//WAP TO COUNT THE ODD DIGITS OF THE GIVEN NUMBER.
package com.practice;

public class WhileOddDemo4 {

	public static void main(String[] args) {
	
		int num = 942111423;
		int count =0;
		while(num != 0) {
			int rem = num % 10;
			 if(rem %2 ==1) {
				 
				 count++;
			 }
			 num /= 10;

		}
        System.out.println("Odd Count " + count);
	}

}
