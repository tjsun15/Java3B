
public class week3nine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem 9
		
		int[] mathNumber = new int[] { 80, 10, 15 };

		int sum = correctArray(mathNumber);

		if (sum > 100) {
			System.out.println(true);
		}

	}

	public static int correctArray(int[] numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		return sum;
	}
}
