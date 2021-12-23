package fr.formation.inti.heritage;

public class Chat extends Animal implements InterfaceAnimal {
	
	private int age;
	private String couleur;

	public Chat(int age, String couleur) {
		super();
		this.age = age;
		this.couleur = couleur;
	}
	
	public Chat(String nom,int age, String couleur) {
		super(nom);
		this.age = age;
		this.couleur = couleur;
	}


	

	@Override
	public String toString() {
		return "Chat [age=" + age + ", couleur=" + couleur + "]";
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	@Override
	public String getAnimalNom() {
		
		return "chat";
	}

	@Override
	public void manger() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void respirer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void parler() {
		// TODO Auto-generated method stub
		
	}

	

}
