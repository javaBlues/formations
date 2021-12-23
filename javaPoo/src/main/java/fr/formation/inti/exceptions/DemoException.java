package fr.formation.inti.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

import fr.formation.inti.heritage.Chat;

/**
 * try - catch - finally - throw - throws
 * 
 * @author spring
 *
 */
public class DemoException {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int age = 0;
		Chat tom = null;

		try {

			System.out.println("Entrez un chiffre entre 0 et 100 ");
			age = sc.nextInt();
			sc.nextLine();
//			tom.setAge(age);
			NullPointerException ex = new NullPointerException();
			throw ex;

		} catch (InputMismatchException e) {// InputMismatchException e = new InputMismatchException()
			System.err.println(" mauvaise saisie!" + e.getMessage());
		} catch (NullPointerException e) {
			System.err.println("null pointer");
		} catch (Exception e) {
			System.err.println("defaut");
		} finally {
			System.out.println("finally");

		}

		System.out.println("age : " + age);

		try {
			saisie();
		} catch (ExceptionDemo e) {
			System.out.println("Exception age < 0 " + e.getMessage());
		}

		System.out.println("fin programme!");

	}

	public static void saisie() throws ExceptionDemo {
		Scanner sc = new Scanner(System.in);

		int age = 0;
		age = sc.nextInt();
		if (age < 0)
			throw new ExceptionDemo();
	}

}
