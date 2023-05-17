//WAP that checks a number from 0 to 5 and prints its spelling, if the number is
//greater than 5 print it is greater than 5.

package com.basic.ifelse;
import java.io.*;

public class IfElseDemo4 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter number : ");
		int num=Integer.parseInt(br.readLine());
		
		if(num==0) {
			
			System.out.println("Zero");
			
		}else if(num==1) {
			
			System.out.println("One");
			
		}else if(num==2) {
			
			System.out.println("Two");
			
		}else if(num==3) {
			
			System.out.println("Three");
			
		}else if(num==4) {
			
			System.out.println("Four");
			
		}else if(num==5) {
			
			System.out.println("Five");
			
		}else {
			
			System.out.println(num + " is greater than five");
			
		}
	}

}
