package assigment1;

import java.util.Scanner;

public class Negativeprint {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i = input.nextInt();
		if(i<0){
			System.out.println(i);
		}
		else {
			System.out.println("Entered number is positive.");
		}

	}
}
