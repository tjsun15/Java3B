
public class week3eleven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] hwArray = new double[5];

		hwArray[0] = 10.5;
		hwArray[1] = 12.1;
		hwArray[2] = 4.5;
		hwArray[3] = 1.5;
		hwArray[4] = 2.0;
		
		double[] swArray = new double[5];

		swArray[0] = 10.1;
		swArray[1] = 8.4;
		swArray[2] = 3.2;
		swArray[3] = 1.4;
		swArray[4] = 7.0;
		
		
		
		if (correctAverage(swArray) < calculateAverage(hwArray));
		System.out.println(true);
	}

	public static double calculateAverage(double[] numbers) {
		double sum = 0;
		
		for (double number : numbers) {
			sum += number;
		}
		return sum/numbers.length;

	}

	public static double correctAverage(double[] numbers) {
		double sum = 0;
		
		for (double number : numbers) {
			sum += number;
		}
		return sum/numbers.length;
	
	
		
		
		
		
	}

}
