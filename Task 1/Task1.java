class Task1 {

	public static void main(String[] args) {

		// 1.a Skriv en metode printIfPalindrome() som tager en tekststreng som argument og printer den HVIS den kan skrives bagfra uden at ændre sig. (
		System.out.println("Task 1.a");
		printIfPalindrome("141"); // Will be printed
		printIfPalindrome("142"); // Will not be printed

		// 1.b Sørg for at metoden ikke er case-sensitiv.
		System.out.println("Task 2.a");
		printIfPalindrome("mellEM");

		// 1.c Kald metoden fra main med argumentet "Den laks skal ned", for at teste den.
		System.out.println("Task 3.a");
		printIfPalindrome("Den laks skal ned"); // Will not be printed

	}

	public static void printIfPalindrome(String text){
		String reverse = "";
		for (int i = text.length() - 1; i >= 0; i--) {
			reverse = reverse + text.charAt(i);
		}
		if (text.equalsIgnoreCase(reverse)) {
			System.out.println(text);
		}
	}
}