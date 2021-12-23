package fr.formation.inti.heritage;

public abstract class Animal {
	
	private String nom;
	
	public Animal() {
		this.nom = this.getAnimalNom();
	}
	
	public Animal(String nom) {
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public abstract String getAnimalNom();

	
	public static void test4() {
		System.out.println();
	}


}
