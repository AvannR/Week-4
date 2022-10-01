package Project;

public class CodingAssignment {

	public static void main(String [] args) {
		
		int [] ages = {3, 9, 23, 64, 2, 8, 28, 93, 27};
		System.out.println(ages[ages.length - 1] - ages[0]);
		
		double sum = 0;
		for(int i =0; i < ages.length; i++) {
			sum += ages[i];
		}
		
		double average = sum / ages.length;
		System.out.println(average);
		
		String [] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		double totalLetters = 0;
		for(int i = 0; i < names.length; i++) {
			totalLetters += names[i].length();
		}
		
		double letterAverage = totalLetters / names.length;
		System.out.println(letterAverage);
		
		String allNames = "";
		
		for(int i = 0; i <names.length; i++) {
			allNames += names[i] + " ";
			
			
		}
		System.out.println(allNames);
		
		System.out.println(names[names.length -1]);
		System.out.println(names[0]);
		
		int[] nameLengths = new int[names.length];
		for(int i =0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
			System.out.println(nameLengths[i]);
		}
		
		int sumAllLengths = 0;
		for(int i =0; i < nameLengths.length; i++) {
			sumAllLengths += nameLengths [i];
		}
		System.out.println(sumAllLengths);
		
		String hello = multiplyString("Hello ", 3);
		System.out.println(hello);
		
		String fullName = printName("Jovan", "Rivera");
		System.out.println(fullName);
		
		int[] numArray = {59, 27, 10, 16, 29};
		System.out.println(isGreaterThan100(numArray));
		
		double[] doubleArray = {19.5, 24.11, 36.18, 27.89};
		System.out.println(tallyAverage(doubleArray));
		
		double[] doubleArray2 = {21.5, 39.6, 67.7};
		System.out.println(isGreaterAverage(doubleArray, doubleArray2));
		System.out.println(isGreaterAverage(doubleArray2, doubleArray));
		
		System.out.println(willBuyDrink(true, 8.5));
		System.out.println(willBuyDrink(false, 20.0));
		System.out.println(willBuyDrink(true, 50.25));
		
		System.out.println(divide(doubleArray[1], doubleArray2[2]));
		
	}
	
	public static String multiplyString(String word, int n) {
		String result = "";
		for(int i= 0; i < n; i++) {
			result += word;
		}
		return result;
	}
	
	public static String printName(String firstName, String lastName) {
		return firstName + " " + lastName;
	}
	
	public static boolean isGreaterThan100(int[] numbers) {
		int sum = 0;
		for(int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		return sum > 100;
	}
	
	public static double tallyAverage (double[] numbers) {
		double sum = 0;
		for(int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		return sum;
	}
	
	public static boolean isGreaterAverage(double[] array1, double[] array2) {
		return tallyAverage(array1) > tallyAverage(array2);
	}
	
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		return isHotOutside && moneyInPocket > 10.50;
	}
	
	//divides and returns remainder with decimals. Helps to know if calculation results in odd or even number.
	public static double divide(double x, double y) {
		double sum = x % y;
		return sum;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


