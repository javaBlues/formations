package fr.formation.inti.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import fr.formation.inti.heritage.Animal;
import fr.formation.inti.heritage.Chat;

public class ListExample {
	
	public static void main(String[] args) {
		//create list
		List<String> list  = new LinkedList<String>();
		
		//methode add ajouter des elements dans la liste
		list.add("Nicolas");
		list.add("patrick");
		list.add("alaric");
		
		list.add(1, "patrick");
		list.add(0,"bastien");
		
		list.remove(1);
		for(String s : list) {
			System.out.println(s);
		}
		System.out.println("---------------------------");
		
		Chat tom = new Chat("Tom", 2, "bleu");
		Chat tom2 = new Chat("Tom2", 2, "gris");
		
		List<Chat> chats = new ArrayList<Chat>();
		
		chats.add(tom2);
		chats.add(null);
		chats.add(tom);
		chats.add(new Chat(3, "noir"));
		chats.add(null);
		try {
			for(Chat c : chats) {
				
					System.out.println(c+ " : "+c.getNom());
				
			}
		} catch (NullPointerException e) {
			System.err.println(" c est null");
		}
		System.out.println("-----------ex: Iterator ------------");
		ListIterator<Chat> it = chats.listIterator();
		
		while(it.hasNext()) {
			Chat c = it.next();
			System.out.println(c);
		}
		List<Chat> subChats = chats.subList(2, 4);
		System.out.println("------------- subList ---------------");
		subChats.forEach(c->System.out.println(c));
		
		
	}

}
