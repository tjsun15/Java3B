
public class week3ten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem 10 

				double[] hwArray = new double[5];

				hwArray[0] = 10.5;
				hwArray[1] = 12.1;
				hwArray[2] = 4.5;
				hwArray[3] = 1.5;
				hwArray[4] = 2.0;
				
				System.out.println(calculateAverage(hwArray));
			}

			public static double calculateAverage(double[] numbers) {
				double sum = 0;
				
				for (double number : numbers) {
					sum += number;
				}
				return sum/numbers.length;
			
					}

	}


