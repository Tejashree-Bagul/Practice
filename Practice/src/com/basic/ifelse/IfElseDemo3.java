//WAP take a number and print whether it is positive or negative

package com.basic.ifelse;
import java.io.*;

public class IfElseDemo3 {

	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter number : ");
		int num = Integer.parseInt(br.readLine());
		
		if(num>=0) {
			
			System.out.println(num + " is positive ");
			
		}else{
			
			System.out.println(num + " is negative number");
		}

	}

}
