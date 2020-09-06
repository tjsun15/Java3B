
public class week3one {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem 1a

		int[] ages = new int[8];

		int[] agesB = new int[ages.length + 1];

		ages = agesB;

		int sumAges = 0;

		ages[0] = 3;
		ages[1] = 9;
		ages[2] = 23;
		ages[3] = 64;
		ages[4] = 2;
		ages[5] = 8;
		ages[6] = 28;
		ages[7] = 93;

		while (ages.length < 8)
			;
		{

			System.out.println("Difference in ages:" + " " + (ages[7] - ages[0]));
		}

		// Problem 1b

		ages[0] = 3;
		ages[1] = 9;
		ages[2] = 23;
		ages[3] = 64;
		ages[4] = 2;
		ages[5] = 8;
		ages[6] = 28;
		ages[7] = 93;
		ages[8] = 15;

		while (ages.length < 9)
			;
		{

			System.out.println("New array difference:" + " " + (ages[8] - ages[0]));

		}
		// Problem 1c

		for (int age : ages) {
			sumAges += age;

		}

		double average = sumAges / 9;

		System.out.println("Average of array:" + " " + average);

	}
}
