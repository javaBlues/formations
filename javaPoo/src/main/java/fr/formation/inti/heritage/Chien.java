package fr.formation.inti.heritage;

public class Chien extends Animal implements IComportement {

	private String famille;
	private int taille;

	public Chien(String famille, int taille) {
		this.famille = famille;
		this.taille = taille;
	}

	public Chien(String nom, String famille, int taille) {
		super(nom);
		this.famille = famille;
		this.taille = taille;

	}

	public String getFamille() {
		return famille;
	}

	public void setFamille(String famille) {
		this.famille = famille;
	}

	public int getTaille() {
		return taille;
	}

	public void setTaille(int taille) {
		this.taille = taille;
	}

	@Override
	public String getAnimalNom() {

		return "Chien";
	}

	public String getAnimalNom(String nom) {

		return "Chien";
	}

//	@Override
//	public void manger() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	
//
//	@Override
//	public void parler() {
//		
//	}

	@Override
	public void drink() {
		
	}

	@Override
	public void marcher() {
		System.out.println("marcher ...");
	}

	@Override
	public int sauter() {
		return 1;
	}

	public static void test() {
		
	}
	public static void respirer() {
		System.out.println("enfin ");
	}
	

	

	
	
	
	
}
