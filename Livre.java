package mainBiblio;


public class Livre extends Article {
	
	private String auteur;

	public Livre(String nom, String genre, String auteur) {
		super(nom, genre, "Livre");
		this.auteur = auteur;
	}
	
	

	public String getAuteur() {
		return auteur;
	}

}