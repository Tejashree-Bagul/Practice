//WAP take a number & print whether it is less than 10 or greater than 10

package com.basic.ifelse;
import java.io.*;

public class IfElseDemo2 {

	public static void main(String[] args) throws IOException {
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int var = 10;
        
        System.out.println("Enter the number : ");
        int num = Integer.parseInt(br.readLine());
        
        if(num>var) {
        	 
        	System.out.println(num + " is greater than "+ var);
        	
        }else if(num == var){
        	
        	System.out.println(num + " is equal to  "+ var);
        	
        }else {
        	
        	System.out.println(num + " is less than "+ var);
        }
	}

}
