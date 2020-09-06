import java.util.Scanner;

public class week3thirteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Problem 13
		/*
		 * I used a scanner method with conditional statements for this problem. The
		 * scanner method takes input from a user. The "if", and "else if" statements
		 * check the boolean expressions for true or false. I used this method to check
		 * for age verification for an "R" movie.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome guest");

		System.out.print("Please enter your age: ");
		int input = sc.nextInt();

		if (input < 18) {
			System.out.println("You need to be 18 years of age to see this movie.");

		} else if (input >= 18) {
			System.out.println("Please enjoy the moving screening.");

		}

	}

}
