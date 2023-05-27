//WAP to take size of the Array from user and also take integer elements
//from user. Print the sum of odd numbers.

package com.array.assignment1.in;
import java.io.*;

public class ArrayDemoProb1 {

	public static void main(String[] args)throws IOException  {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Size of the array : ");
		int size = Integer.parseInt(br.readLine());
		
		int arr[] = new int[size];
		
		System.out.println("Enter elements in the Array : ");
		for(int i=0; i<arr.length; i++) {
			
			arr[i] = Integer.parseInt(br.readLine());
		}
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]%2 != 0) {
				
				sum = sum + arr[i];
			}
		}
		System.out.println("Sum of Odd numbers are : " + sum);

	}

}
