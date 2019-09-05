package lab_3;

import java.util.Scanner;

public class sumValue {

	public static void main(String[] args) {
		
		int x, y, z, average;
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		System.out.print("Enter a value for xcision: ");
		x = sc.nextInt();
		System.out.println();
		
		System.out.print("Enter a value for yams: ");
		y = sc.nextInt();
		System.out.println();
		
		System.out.print("Enter a value for zeta: ");
		z = sc.nextInt();
		System.out.println();
		
		average = (x + y + z) / 3;
		
		System.out.println("X = " + x);
		System.out.println("Y = " + y);
		System.out.println("Z = " + z);
		System.out.println("Average = " + average);
		System.out.println();
	}

}