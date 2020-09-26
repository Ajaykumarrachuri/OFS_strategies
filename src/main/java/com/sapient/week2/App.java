package com.sapient.week2;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
        System.out.println("Date-Time Calculator");
		
		//Creating Menu
		while(true){
			System.out.println();
			System.out.println("To perform addition of two dates, Enter 1");
			System.out.println("To perform subtraction of two dates, Enter 2");
			System.out.println("To perform addition of n Days, Months, Weeks to the given date, Enter 3");
			System.out.println("To perform substraction of Days, Months, Weeks to the given date, Enter 4");
			System.out.println("To perform substraction of Days, Months, Weeks to the given date, Enter 4");
			System.out.println("To determine day of the week for the given date, Enter 5");
			System.out.println("To determine week number for the given date, Enter 6");
			System.out.println("To Exit, Enter 7");

			System.out.println();
			System.out.println("Enter choice::");
			int choice = scan.nextInt();

			switch(choice){
			case 1: System.out.println("Addition of two dates");
			String date1=scan.nextLine();
			String date2=scan.nextLine();
			break;
			case 2: System.out.println("Subtracting of two dates");
			break;
			case 3: System.out.println("Dividing the numbers");
			break;
			case 4: System.out.println("Multiplying the numbers");
			break;
			case 5: System.out.println("Multiplying the numbers");
			break;
			case 6: System.out.println("Multiplying the numbers");
			break;
			case 9: System.out.println("exiting");
			System.exit(0);
			break;
			default: System.out.println("Incorrect input!!! Please re-enter choice from our menu");
			}
		}

	}

	}


