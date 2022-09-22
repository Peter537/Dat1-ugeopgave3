class Task2 {

	public static void main(String[] args) {

		// 2.a Lav en metode, printPartOfWord(), med tre parametre: 1. parameter er ordet, 2. parameter er index for det bogstav delmængden starter med,
		// og 3. parameter er længden på delmængden Ex: argumenterne "København", 1 og 4 skal give outputtet "øben".

		System.out.println("Task 2.a");
		printPartOfWord("Kobenhavn", 1, 4);

	}

	public static void printPartOfWord(String word, int index, int length) {
		System.out.println(word.substring(index, length + 1));
	}
}