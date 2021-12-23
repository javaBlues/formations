package fr.formation.inti.collections.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * collection stoquant des objets contenant des mappages entre des clés
 * et des valeurs(chaque cle correspond à une valeur)
 * @author spring
 *
 */
public class MapExample {

	public static void main(String[] args) {
		affiche("example","test","eadae","aedae");
		
		// <key,value>
		Map<String, String> repTel = new HashMap<String, String>();
		repTel.put("06215487", "tom");
		repTel.put("06215486", "tom2");
		repTel.put("06215481", "tom4");
		repTel.put(null, "tom4");
		
		System.out.println(repTel);
		Set<String> numTels = repTel.keySet();
		Collection<String> nomTels = repTel.values();
		System.out.println("--------------------------");
		repTel.entrySet().stream()
		.filter(entry-> "tom4".equals(entry.getValue()))
		.forEach(System.out::println);
		System.out.println("--------------------------");
		
		System.out.println(nomTels);
		
		for(String num : numTels) {
			String nom = repTel.get(num);
			System.out.println("key = "+num+" ,val = "+nom);
		}
		
		System.out.println("--------------------");
		repTel.forEach((num,nom)->System.out.println("["+num+" , "+nom+" ]"));
		
		
		
	}
	
	
	public static void affiche(String...args ) {
		for(String s : args)
			System.out.println(s);
	}

}
