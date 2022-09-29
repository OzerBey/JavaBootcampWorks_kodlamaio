package classes.valueAndReferenceTypes;

public class ValueAndReferenceType {

	public static void main(String[] args) {
		Type type = new Type();
		type.addType();

		// value type -integer,double,float etc. is value type
		int number1 = 23; // number1 is 23 here
		int number2 = 34; // number2 is 34 here
		number2 = number1; // assignment operation
		number1 = 55; // now number1 is 55 but number2 is 23
		System.out.println(number2); // print 23 number

		// reference type -Arrays are reference type
		int numbers1[] = new int[] { 10, 20, 30 }; // numbers1 array holds the values 10,20,30 in heap
		int numbers2[] = new int[] { 1, 2, 3 }; // numbers2 array holds the values 1,2,3
		numbers2 = numbers1; // assignment operation then now numbers2 array holds values of numbers1 array
		numbers1[0] = 55; // {55,10,30}
		System.out.println(numbers2[0]); // writes 55 on the screen

	}

}
