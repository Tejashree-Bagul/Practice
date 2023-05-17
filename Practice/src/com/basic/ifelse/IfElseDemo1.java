//WAP to check if a number is even or odd.

package com.basic.ifelse;
import java.io.*;

public class IfElseDemo1 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		     System.out.println("Enter number to check : ");
		     int num = Integer.parseInt(br.readLine());
		     
             if(num%2==0) {
            	 
            	 System.out.println(num + " is an even number");
            	 
             }else {
            	 
            	 System.out.println(num + " is an odd number");
            	 
             }
	}

}
