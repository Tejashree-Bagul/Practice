//WAP take 10 input from user and print only elements that are divisible by 5

package com.array.assignment1.in;
import java.io.*;

public class ArrayDemoProb5 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter 10 integer : ");
		int arr[] = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			
			arr[i] = Integer.parseInt(br.readLine());
				
		}
		System.out.println("Numbers divisible by 5 are : ");
        for(int i=0; i<arr.length; i++) {
        	
        	if(arr[i] % 5 == 0) {
        		
        		System.out.println(arr[i] + "  ");
        	}
        }
	}

}
