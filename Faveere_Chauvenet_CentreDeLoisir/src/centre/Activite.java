package centre;

import java.util.HashSet;
import peuple.*;
import java.util.Date;

/*
 * FAVEERE Sarah
 * CHAUVENET Thibault
 * LP apprentissage
 * 2014-2015
 * IUT de Nantes
*/

//Classe décrivant une activité
public class Activite {
	
	//ATTRIBUTS
	private static int numUnique = 0;
	private String type;
	private HashSet<Enfant> tabEnfants;
	private HashSet<Animateur> tabAnimateurs;
	private String date;
	private boolean passe;
	
	
	//CONSTRUCTEURS
	public Activite(String type, String date)
	{
		this.type = type;
		this.date = date;
		
		this.tabEnfants = new HashSet<Enfant>();
		this.tabAnimateurs = new HashSet<Animateur>();
		
		Activite.numUnique++;
	}

	
	//ACCESSEURS

	public static int getNumUnique() {
		return numUnique;
	}


	public static void setNumUnique(int numUnique) {
		Activite.numUnique = numUnique;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public HashSet<Enfant> getTabEnfants() {
		return tabEnfants;
	}


	public void setTabEnfants(HashSet<Enfant> tabEnfants) {
		this.tabEnfants = tabEnfants;
	}


	public HashSet<Animateur> getTabAnimateurs() {
		return tabAnimateurs;
	}


	public void setTabAnimateurs(HashSet<Animateur> tabAnimateurs) {
		this.tabAnimateurs = tabAnimateurs;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public boolean isPasse() {
		return passe;
	}


	public void setPasse(boolean passe) {
		this.passe = passe;
	}
	
	
	//METHODES
	
	
	//Méthode permettant de vérifier qu'une date est conforme ainsi que si elle est déjà passée ou non
	public int verifierDate(String d)
	{
		
		
		return 0;
	}
	

}
