
public class week3two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem 2a

		String names[] = { "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob" };

		int allNames = 0;
		for (int i = 0; i < names.length; i++) {

			int letterperName = names[i].length();
			allNames = allNames + letterperName;
		}

		System.out.println(allNames / names.length);

		// Problem 2b

		for (int i = 0; i < names.length; i++) {
			System.out.print(" " + names[i]);
		}

	}

}
