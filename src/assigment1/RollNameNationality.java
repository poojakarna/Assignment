package assigment1;

import java.util.Scanner;

public class RollNameNationality {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter roll :");
		int roll = sc.nextInt();
		System.out.println("Enter name :");
		String name = sc.next();
		System.out.println("Enter nationality :");
		String nationality = sc.next();
		System.out.println("Roll : " +roll);
		System.out.println("Name : " +name);
		System.out.println("Nationality :" +nationality);
	}

}
