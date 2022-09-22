import java.util.Random;

class MathWork {

	// 3.d add the following array to the class: int[] arr = { 1, 1, 1, 2, 2, 3, 3, 3, 4, 5, 5, 5, 6, 6, 7, 8, 8, 9, 9, 10 }
	static int[] arr = { 1, 1, 1, 2, 2, 3, 3, 3, 4, 5, 5, 5, 6, 6, 7, 8, 8, 9, 9, 10 };

	public static void main(String[] args) {

		// 3.b Write a method 'divisible', that takes in an integer as a parameter and prints all values between 0 and 100 that are divisible by the parameter received.
		// 3.c call the method from main
		int divisibleNumber = 5;
		System.out.println("Divisible with: " + divisibleNumber);
		divisible(divisibleNumber);

		// 3.e Write a method, 'getRandom' that returns a random element from the above array.
		System.out.println("Random number:");
		System.out.println(getRandom(arr));

		// 3.f Write a function that takes an integer as a parameter and prints the number.
		// After that, it subtracts one from the input and calls itself again (recursion).
		// If the input is less than zero, it should no longer call itself.
		System.out.println("Recursive function:");
		recursive(19);
	}

	public static void divisible(int input) {
		for (int i = 0; i <= 100; i++) {
			if (i % input == 0) {
				System.out.println(i);
			}
		}
	}

	public static int getRandom(int[] array) {
		return array[new Random().nextInt(array.length)];
	}

	public static int recursive(int n) {
		if (n < 0) return -1;
		System.out.println(n);
		return recursive(n - 1);
	}
}