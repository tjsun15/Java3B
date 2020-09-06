
public class week3seven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem 7.

		
		System.out.println(tripleString("Hello", 3));
	}
		
		public static String tripleString(String word, int n ) {
			String result = "";
			for (int i = 0; i < n; i++) {
				result += word;// return = return + word
				
			}
			return result;
		}
	}


	// Write method that takes a String and int and returns the word concatenated
	// 1. Write method with parameters
	// 2. Focus on logic (what condition will be tested>>> for loop
	// 3. Add the string to itself until the loop is false
	// 4. Return the result