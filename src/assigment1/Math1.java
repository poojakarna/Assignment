package assigment1;

import java.util.Scanner;

public class Math1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter u :");
		double u = sc.nextDouble();
		System.out.println("Enter t :");
		double t = sc.nextDouble();
		System.out.println("Enter a :");
		double a = sc.nextDouble();
		double s = ((u*t)+(a*t*t*1/2));
		System.out.println("s:"+s);

	}
}
