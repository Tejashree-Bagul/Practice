//WAP in which according to month number print the number of days in that month

package com.basic.ifelse;
import java.io.*;

public class IfElseDemo5 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the month number : ");
		int num = Integer.parseInt(br.readLine());
		
		if(num==1) {
			
			System.out.println("January has 31 Days");
			
		}else if(num==2) {
			
			System.out.println("February has 28/29 days");
			
		}else if(num==3) {
			
			System.out.println("March has 31 days");
			
		}else if(num==4) {
			
			System.out.println("April has 30 days");
			
		}else if(num==5) {
			
			System.out.println("May has 31 days");
			
		}else if(num==6) {
			
			System.out.println("June has 30 days");
			
		}else if(num==7) {
			
			System.out.println("July has 31 days");
			
		}else if(num==8) {
			
			System.out.println("August has 31 days");
			
		}else if(num==9) {
			
			System.out.println("September has 30 days");
			
		}else if(num==10) {
			
			System.out.println("October has 31 days");
			
		
		}else if(num==11) {
			
			System.out.println("November has 30  days");
			
		}else if(num==12) {
			
			System.out.println("December has 31 days");
			
		}else {
			
			System.out.println("Invalid month");
			
		}
	}

}
