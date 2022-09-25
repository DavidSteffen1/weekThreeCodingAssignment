public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//1
		int[] ages = {3, 9, 23, 15, 2, 8, 28, 55};
		System.out.println(ages[ages.length - 1] - ages[0]);
		
		double agesTotal = 0;
		for (int i = 0; i < ages.length; i++) {
			agesTotal += ages[i];
		}
		
		double agesAverage = agesTotal / ages.length;
		
		System.out.println(agesAverage);
			//2a
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		double namesTotal = 0;
		for (int i = 0; i < names.length; i++) { 
			namesTotal += names[i].length();
		}
		
		double namesAverage = namesTotal / (names.length);
		
		System.out.println(namesAverage);
			//2b
		String namesConc = "";
		
		for (int i = 0; i < names.length; i++) {
			namesConc += names[i];
			if (i < names.length - 1) {
				namesConc += " ";
			}
		}
		
		System.out.println(namesConc);
			//5
		int[] nameLengths = new int[names.length];
		
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}
			//6
		double nameLengthsSum = 0;
		for (int i = 0; i < nameLengths.length; i++) {
			nameLengthsSum += nameLengths[i];
		}
		
		System.out.println(nameLengthsSum);
		//parameters to test methods	
		
		/*
		System.out.println(selfConcat("Hello", 3));
		System.out.println(createName("David", "Steffen"));
		int[] numberArray = {22,91};
		double[] firstNumberArray = {99,5};		
		double[] secondNumberArray = {14,5};		
		System.out.println(moreThanOneHundred(numberArray));
		System.out.println(averageOfArray(numberArray));
		System.out.println(firstArrayGreaterAverage(firstNumberArray, secondNumberArray));
		System.out.println(willBuyDrink(true, 5));
		System.out.println(chancesOfAllHeads(5));
		*/
		
		/*		
		System.out.println(selfConcat("Goodbye", 2));
		System.out.println(createName("John", "Smith"));
		int[] numberArray = {64,5};
		double[] firstNumberArray = {64,5};		
		double[] secondNumberArray = {100,5};		
		System.out.println(moreThanOneHundred(numberArray));
		System.out.println(averageOfArray(numberArray));
		System.out.println(firstArrayGreaterAverage(firstNumberArray, secondNumberArray));
		System.out.println(willBuyDrink(true, 12));
		System.out.println(chancesOfAllHeads(3));
		*/
	}
			//7
	public static String selfConcat(String word, int n) {
		String concatString = "";
		for (int i = 0; i < n; i++){
			concatString += word;
		}
		return concatString;
	}
			//8
	public static String createName(String firstName, String lastName) {
		String fullName = firstName + " " + lastName;
		return fullName;
	}
	
			//9
	public static boolean moreThanOneHundred(int[] inputArray) {
		int arrayTotal = 0;
		for (int i = 0; i < inputArray.length; i++) {
			arrayTotal += inputArray[i];
		}
		
		if (arrayTotal > 100) {
			return true;
		} else {
			return false;
		}
	}
			
			//10
	public static double averageOfArray(int[] inputArray) {
		double arrayTotal = 0;
		double arrayAverage = 0;
		for (int i = 0; i < inputArray.length; i++) {
			arrayTotal += inputArray[i];
		}
		
		arrayAverage = arrayTotal / inputArray.length;
		return arrayAverage;
	}
	
			//11
	public static boolean firstArrayGreaterAverage(double[] firstArray, double[] secondArray) {
		double firstArrayAverage = 0;
		double secondArrayAverage = 0;
		for (int i = 0; i < firstArray.length; i++) {
			firstArrayAverage += firstArray[i];
		}
		
		for (int i = 0; i < secondArray.length; i++) {
			secondArrayAverage += secondArray[i];
		}
		
		if (firstArrayAverage > secondArrayAverage) {
			return true;			
		} else {
			return false;
		}
	}
			//12
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside && moneyInPocket > 10.50) {
			return true;
			} else {
			return false;
		}
	}
	
			//13
	//This method returns the chances that flipping a fair coin will result in heads for any number of attempts
	public static double chancesOfAllHeads(int attempts) {
		double oddsOfAllHeads = 1;
		if (attempts < 0) {
			return 0.00;
		} else {
			int count = 1;
			do {
				oddsOfAllHeads = oddsOfAllHeads / 2;
				count++;
				} while (count < attempts);
			return oddsOfAllHeads;
		}
	}


}
	


