//WAP to take size of array from user and also take integer elements from user
// print product of even numbers only.

package com.array.assignment1.in;
import java.io.*;

public class ArrayDemoProb2 {

	public static void main(String[] args)throws IOException {
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Size of the array : ");
		int size = Integer.parseInt(br.readLine());
		
		int arr[] = new int[size];
		
		System.out.println("Enter elements in the Array : ");
		for(int i=0; i<arr.length; i++) {
			
			arr[i] = Integer.parseInt(br.readLine());
		}
		int prod = 1;
        for(int i=0; i<arr.length; i++) {
			
			if(arr[i]%2 == 0) {
				
				prod = prod * arr[i];
			}
		}
		System.out.println("Product of an Even numbers are : " + prod);

		

	}

}
