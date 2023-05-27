//WAP take 7 characters as Input, print only values from the array 

package com.array.assignment1.in;
import java.io.*;

public class ArrayDemoProb4 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter characters : ");
		char charr[] = new char[7];
		
		for(int i=0; i<charr.length; i++) {
			
			charr[i] = (char)br.read();
			br.skip(2);
		}
        for(int i=0; i<charr.length; i++) {
        	
        	if(charr[i]=='a' || charr[i]=='e' || charr[i] =='i' || charr[i]=='o' || charr[i]== 'u' ||
        	charr[i] == 'A' || charr[i]== 'E' || charr[i] == 'I' || charr[i] == 'O' || charr[i] == 'U') {
        		
        		System.out.println(charr[i] + "  ");
        	}
        }
        
	}

}
