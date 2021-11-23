import java.util.Scanner;

//*******STEP ONE*******
//Claim the code! Write an appropriate header for this class

public class MetricConverter 
{

	// *******STEP TWO*******
	// Declare a field within the Metrics class called CM_PER_INCH.
	// The field should be private and constant (it cannot change).
	// Give the field a reasonable data type - This field will represent the number
	// of centimeters in an inch.
	// Initialize the field to 2.54 (one inch is equal to 2.54 centimeters).

	// This method takes in an amount of feet and inches and converts it to an
	// amount of centimeters.

	public int feetAndInchesToCentimeters(int ft, int inches) 
	{
		// *******STEP THREE*******
		// a) Declare an integer variable called centimeters.

		// b) Convert ft and inches to centimeters. Keep in mind that there are 12
		// inches in a foot. Make sure you use the field
		// CM_PER_INCH in your conversion! Finally, round the answer to the nearest
		// whole number and put the result of your
		// calculation into the variable centimeters.

		// c) Return the variable centimeters.

		return 0; // This is here so that the code compiles. Remove this line of code when you
					// finish step 3.
	}

	public static void main(String[] args) 
	{

		// User input
		System.out.print("Please enter an amount of feet --> ");
		Scanner kboard = new Scanner(System.in);
		int feet = kboard.nextInt();

		System.out.print("Please enter an amount of inches --> ");
		int inches = kboard.nextInt();

		// Call the converter method
		MetricConverter converter = new MetricConverter();
		int centimeters = converter.feetAndInchesToCentimeters(feet, inches);

		// *******STEP FOUR*******
		// Print out your answer to the screen.
		// !!! When you print, format the output *exactly* like this (without the
		// quotes):
		// "5 feet, 10 inches is equal to 178 centimeters."
		// This is also a correct conversion - you can use these values to know if your
		// converter is working!

	}
}