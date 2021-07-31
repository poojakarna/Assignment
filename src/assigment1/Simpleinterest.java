package assigment1;

import java.util.Scanner;

public class Simpleinterest {

	public static void main(String[] args) {
		float p, r, t, simpleinterest;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter princple:");
		p =scan.nextFloat();
		System.out.println("Enter Rate of Interest:");
		r=scan.nextFloat();
		System.out.println("Enter Time :");
		t =scan.nextFloat();
		simpleinterest = (p*t*r)/100;
		System.out.println("simple Interest is :" +simpleinterest);
		
		
		
		
		

	}


}
