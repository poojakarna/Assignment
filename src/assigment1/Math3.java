package assigment1;

import java.util.Scanner;

public class Math3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a :");
		int a = sc.nextInt();
		System.out.println("Enter b :");
		int b = sc.nextInt();
		System.out.println("Enter c :");
		int c = sc.nextInt();
		double x= ((-b)+(Math.sqrt(b*b)-(a*c*4)*a*2));
		System.out.println("x :" + x);

	}

}
