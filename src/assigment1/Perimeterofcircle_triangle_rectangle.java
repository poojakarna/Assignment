package assigment1;

import java.util.Scanner;

public class Perimeterofcircle_triangle_rectangle {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Perimeter of circle");
	      System.out.println("2.Perimeter of triangle");
	      System.out.println("3.Perimeter of rectangle");
		System.out.println("Enter one of them :");
		int num =sc.nextInt();
		switch(num)
	      {
	         case 1: System.out.println("Enter radius of circle: ");
	         double radius = sc.nextFloat();
	         double perimeterCircle = (2*22 * radius) / 7;
	         System.out.println(" Perimeter of Circle is " + perimeterCircle);
	         break;
	          case 2: System.out.println("Enter s1, s2 and s3 of triangle: ");
	         double s1 = sc.nextFloat();
	         double s2 = sc.nextFloat();
	         double s3 = sc.nextFloat();
	         double perimeterTriangle = s1+s2+s3;
	         System.out.println("Perimeter of triangle is: " + perimeterTriangle);
	         break;
	         case 3: System.out.println("Enter length and breadth of rectangle: ");
	         int length = sc.nextInt();
	         int breadth = sc.nextInt();
	         int perimeterRectangle = 2*(length + breadth);
	         System.out.println(" Perimeter of rectangle is: " + perimeterRectangle);
	         break;
	         default:System.exit(0);
		

}
}
}