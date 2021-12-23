package fr.formation.inti.heritage;

public class DemoAnimal {

	public static void main(String[] args) {

		Animal tom = new Chat("Tom", 2, "bleu");
		
		System.out.println("nom :"+ tom.getNom());
		System.out.println("animalNom :"+tom.getAnimalNom());
		
		boolean isChat = tom instanceof Chat;
		System.out.println("tom is chat ? "+isChat);
		
		boolean isAnimal = tom instanceof Animal;
		System.out.println("tom is animal ? "+isAnimal);
		
		boolean isChien = tom instanceof Chien;
		System.out.println("tom is chien ? "+isChien);
		
		System.out.println("----------------------------");
		Chat tom2 = new Chat("Tom2", 2, "gris");
		System.out.println("nom :"+ tom2.getNom());
		System.out.println("animalNom :"+tom2.getAnimalNom());
		
		System.out.println("Couleur : "+tom2.getCouleur());
		System.out.println("age : "+tom2.getAge());
		
		System.out.println("---------------------------");
		Chien killer = new Chien("Killer","pit bull",1);
		IComportement.respirer();
		
		
		System.out.println("nom :"+killer.getNom());
		System.out.println("animalNom :"+killer.getAnimalNom());
		
		System.out.println("---------------------------");
		
		Animal[] animaux = new Animal[3];
		animaux[0] = tom;
		animaux[1] = tom2;
		animaux[2] = killer;
		
		for(Animal a : animaux) {
			System.out.println("animalNom :"+a.getAnimalNom());
		}
		
		
	}

}
