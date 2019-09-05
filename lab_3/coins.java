package lab_3;

import java.util.Scanner;

public class coins {

	public static void main(String[] args) {
		
		int pen;
		int nic;
		int dim;
		int qtr;
		int dol;
		int cen;
		int nic2;
		int dim2;
		int qtr2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		System.out.print("Enter number of pennies: ");
		pen = sc.nextInt();
		System.out.println();
		
		System.out.print("Enter number of nickels: ");
		nic = sc.nextInt();
		nic2 = nic * 5;
		System.out.println();
		
		System.out.print("Enter numner of dimes: ");
		dim = sc.nextInt();
		dim2 = dim * 10;
		System.out.println();
		
		System.out.print("Enter number of quarters: ");
		qtr = sc.nextInt();
		qtr2 = qtr * 25;
		System.out.println();
		
		cen = (pen + nic2 + dim2 + qtr2) % 100;
		dol = (pen + nic2 + dim2 + qtr2) / 100;
		
		System.out.println("You entered " + pen + " pennies");
		System.out.println("You entered " + nic + " nickels");
		System.out.println("You entered " + dim + " dimes");
		System.out.println("You entered " + qtr + " quarters");
		System.out.println();
		System.out.println("Your total is " + dol + " Dollars and " + cen + " Cents");
		System.out.println();
		
	}

}