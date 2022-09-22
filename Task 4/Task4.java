class Task4 {

	public static void main(String[] args) {

		// 4.a Write a method, fibonacci that takes two integers as parameters and prints the first of them.
		// Each printed value should followed by a tab ( \t ).
		// Then have the function calculate and print the fibunacci sequence (0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144) by calling itself.
		// If the input is greater than 1000, then stop. Start the function by calling it from main with the input (1, 1).

		System.out.println("Task 4.a");
		fibonacci(1, 1);

	}

	public static void fibonacci(int a, int b) {
		System.out.println(a + "\t" + b);
		if (b < 1000) {
			fibonacci(b, a + b);
		}
	}
}