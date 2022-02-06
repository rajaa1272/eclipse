package gittest;


//import java.util.Arrays;

import java.util.Scanner;

public class gitthing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int userNumber = 0;
		int myNumber = (int)(Math.random()*100);
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Guess my number(1-100) : ");
			userNumber = sc.nextInt();
			
			if (userNumber == myNumber) {
				
				System.out.println("Yeeeeeeep......its a correct number");
				break;
				
			}
			else if(userNumber > myNumber) {
				System.out.println("your number is too large");
				
			}
			else {
				System.out.println("your number is too small");
			}
		}while(userNumber >= 0);
			
			System.out.println("The correct number is : ");
			System.out.println(myNumber);
		
			
		
			
			
			
			
		}
	

	
	


	}

