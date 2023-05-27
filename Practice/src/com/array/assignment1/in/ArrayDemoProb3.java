//WAP to take size of array from user and also take integer elements from user
//and print product of odd index only.

package com.array.assignment1.in;
import java.io.*;

public class ArrayDemoProb3 {

	public static void main(String[] args)throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter size of an array : ");
		int size = Integer.parseInt(br.readLine());
		
		int arr[] = new int[size];
		
		System.out.println("Enter Elements in an array : ");
		for(int i=0; i<arr.length; i++) {
			
			arr[i] = Integer.parseInt(br.readLine());
		}
		int prod = 1;
		for(int i=0; i<arr.length; i++) {
			
			if(i % 2 != 0) {
				
				prod = prod * arr[i];
			}
		}
		System.out.println("Product of odd index elements are : "+ prod);

	}

}
