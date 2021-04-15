
/**
 * Write a class named TestScores. The class constructor should accept an array of test scores as its argument.
 * The class should have a method that returns the average of the test scores.
 * If any test score in the array is negative or greater than 100, the class should throw an IllegalArgumentException.
 * Demonstrate the class in a program (create a Driver class in the same file).
 * The program should ask the user to input the number of test scores to be counted, and then each individual test score.
 * It should then make an array of those scores, create a TestScore object, and print the average of the scores.
 * If an IllegalArgumentException is thrown, the main method should catch it, 
 * print "Test scores must have a value less than 100 and greater than 0." and terminate the program.
 * Sample Run
 * java Driver
 * Enter·number·of·test·scores:5↵
 * Enter·test·score·1:70↵
 * Enter·test·score·2:65↵
 * Enter·test·score·3:94↵
 * Enter·test·score·4:55↵Enter·test·score·5:90↵
 * 74.8↵
 * 
 * @author Mark Kasule
 */
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) throws Exception {

		Scanner input = new Scanner(System.in);

		// ask user for size
		System.out.print("Enter number of test scores:");
		int testSize = input.nextInt();

		// create an array object
		double[] testArray = new double[testSize];

		for (int i = 0; i < testArray.length; i++) {
			System.out.print("Enter test score " + (i + 1) + ": ");
			try {
				double element = input.nextDouble();
				// assign only scores >= 0 and <= 100
				if (element >= 0 && element <= 100) {
					// store element
					testArray[i] = element;
				} else {
					// show error message
					throw new IllegalArgumentException(
							"Test scores must have a value less than 100 and greater than 0.");
				}

			} catch (IllegalArgumentException ex) {
				System.out.println(ex.getMessage());
				System.exit(0);
			}
		}
		// create a new array object
		TestScores newArray = new TestScores(testArray);

		// return average
		System.out.println(newArray.average());

	}
}

/**
 * class calculates average
 * 
 * @author Mark Kasule
 *
 */
class TestScores {

	private double[] scores;

	public TestScores(double[] scores) {
		this.scores = scores;
	}

	public double average() {

		// track total
		double total = 0;

		for (int i = 0; i < scores.length; i++) {
			total += scores[i];
		}
		return (total / (scores.length));
	}
}
