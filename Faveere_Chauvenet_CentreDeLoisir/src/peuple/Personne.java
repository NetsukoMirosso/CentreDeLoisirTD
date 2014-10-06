package peuple;

/*
 * FAVEERE Sarah
 * CHAUVENET Thibault
 * LP apprentissage
 * 2014-2015
 * IUT de Nantes
*/


//Classe mère représentant les entités humaines
public class Personne {
	
	//ATTRIBUTS
	
	protected String nom;
	protected String prenom;
	
	//CONSTRUCTEUR
	public Personne(String nom, String prenom)
	{
		this.nom = nom;
		this.prenom = prenom;
	}
	
	
	//ACCESSEURS
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	
	

}
