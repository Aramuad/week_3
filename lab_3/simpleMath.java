package lab_3;

import java.util.Scanner;

public class simpleMath {

	public static void main(String[] args) {
		
		float r;
		float t;
		float plus;
		float minus;
		float times;
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		System.out.print("Enter a value for \"R\": ");
		r = sc.nextFloat();
		System.out.println();
		
		System.out.print("Enter a value for \"T\": ");
		t = sc.nextFloat();
		System.out.println();
		
		plus = r + t;
		minus = r - t;
		times = r * t;
		
		System.out.println("R = " + r);
		System.out.println("T = " + t);
		System.out.println("R + T = " + plus);
		System.out.println("R - T = " + minus);
		System.out.println("R * T = " + times);
		System.out.println();
	}

}