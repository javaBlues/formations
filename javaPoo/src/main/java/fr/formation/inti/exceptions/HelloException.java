package fr.formation.inti.exceptions;

public class HelloException {

	public static void main(String[] args) {

		System.out.println("Cette division n'a aucun problème");
		int value = 10 / 2;

		System.out.println("Cette division n'a aucun problème");
		value = 10 / 1;
		System.out.println("Cette division a un problème, divisé par 0");
		try {
			value = 10 / 0;
			
			// Et le code suivant ne sera pas exécuté.
			System.out.println("Value =" + value);
		} catch (ArithmeticException e) {
			// Et le code dans le bloc catch sera exécuté.
			System.out.println("Error: " + e.getMessage());

			// Le code dans le bloc catch sera exécuté.
			System.out.println("Ignore...");
		}

		System.out.println("fin programme!");
	}

}
