
public class week3six {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem 6
		
		
		String names[] = { "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob" };

		int[] namesLengths = new int[names.length];

		for (int i = 0; i < names.length; i++) {

			namesLengths[i] = names[i].length();

		}
		int sum = sumArray(namesLengths);
		
		System.out.println(sum);

	}

	public static int sumArray(int[] totals) {
		int sum = 0;

		for (int total : totals) {
			sum += total;
		}
		return sum;

	}

}
