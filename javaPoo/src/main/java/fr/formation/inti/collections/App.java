package fr.formation.inti.collections;

public class App {

	public static void main(String[] args) {

		int a = 15;
		int b  ;
		//(a > 17) ? a++ : --a
		if(a > 17) {
			b = ++a;
		}else
			b = --a;
		System.out.println(b);
	}

}
