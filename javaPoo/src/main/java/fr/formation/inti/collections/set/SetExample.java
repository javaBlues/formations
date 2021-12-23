package fr.formation.inti.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import fr.formation.inti.heritage.Chat;

/**
 * 1.Set est une collection non ordonnée
 * 2.autorise au maximum 1 element null  
 * 3.n'autorise pas les éléments dupliqués
 * 
 * @author spring
 *
 */
public class SetExample {

	public static void main(String[] args) {

		Set<String> set = new TreeSet<String>();
		
		set.add("Anita");
		set.add("Johana");
		set.add("Fave");
		set.add(new String("Damien"));
		System.out.println("--------------List String -------------- ");
		System.out.println(set);
		System.out.println("------------- stream --------------");
		
		set.stream()
		.map(String :: toUpperCase)
		.filter(s-> s.startsWith("A"))
		.forEach(System.out :: println);
		
		
		Chat tom = new Chat("Tom", 2, "bleu");
		Chat tom2 = new Chat("Tom2", 2, "gris");
		
		Set<Chat> setchat = new HashSet<Chat>();
		setchat.add(tom);
		setchat.add(null);
		setchat.add(tom2);
		setchat.add(null);
		setchat.add(null);
		tom.setAge(5);
		
		setchat.add(tom);
		
		System.out.println(setchat);
		Iterator<Chat> it = setchat.iterator();
		System.out.println("------------ List Iterator----------------");
		while(it.hasNext()) {
			Chat c = it.next();
			System.out.println(c);
		}
		System.out.println("----------------------------------------");
		Set<Integer> setInteger = new HashSet<Integer>();
		setInteger.add(9);
		setInteger.add(3);
		setInteger.add(2);
		setInteger.add(44);
		System.out.println(setInteger);
		Iterator<Integer> itI = setInteger.iterator();
		while(itI.hasNext()) {
			int i = itI.next();
			System.out.println(i);
		}
		Set<Character> setChar = new HashSet<Character>();
		setChar.add('B');
		setChar.add('G');
		setChar.add('A');
		setChar.add(null);
		System.out.println(setChar);
		Iterator<Character> itI2 = setChar.iterator();
		while(itI2.hasNext()) {
			Character cc = itI2.next();
			char c =  cc == null ? ' ': cc;
			System.out.println(c);
		}
	
	}

}
