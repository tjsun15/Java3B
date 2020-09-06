
public class week3five {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String names[] = { "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob" };

		int[] namesLengths = new int[names.length];

		for (int i = 0; i < names.length; i++) {

			namesLengths[i] = names[i].length();

		}

		int totalSum = 0;
		for (int i = 0; i < names.length; i++) {
			totalSum += namesLengths[i];
		}
		System.out.println(totalSum);

	}
}
