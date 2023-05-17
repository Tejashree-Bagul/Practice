//WAP TO PRINT THE SUM OF THE ALL EVEN NO & MULTIPLICATION OF ODD NO BETWEEN  1 TO 10
package com.practice;

public class WhileEvenOddSumMult6 {

	public static void main(String[] args) {
		
		int sum=0;
		int mult =1;
		int num=1;
		
		while(num <= 10) {
			if(num%2==0) { 
				sum=sum+num;
			}
			else {
				mult=mult*num;
			}
		    num++;
		}
		System.out.println(sum);
		System.out.println(mult);

	}

}
