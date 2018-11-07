public class Avion {

	/* ATTRIBUTS PRIVEE */
	private int numAvion;
	private String nomAvion;
	private int nbDePlace;
	
	/* CONSTRUCTEURS */
	//Constructeur vide
	public Avion(){
	}
	
	//Constructeur complet
	public Avion (int unNumero, String unNomAvion, int unNbDePlace){
		this.numAvion = unNumero;
		this.nomAvion = unNomAvion;
		this.nbDePlace = unNbDePlace;
	}

			
	/* ACCESSEURS */
	//numAvion
	public int getNumAvion() {
		return numAvion;
	}
	public void setNumAvion(int numAvion) {
		this.numAvion = numAvion;
	}

	//nomAvion
	public String getNomAvion() {
		return nomAvion;
	}
	public void setNomAvion(String nomAvion) {
		this.nomAvion = nomAvion;
	}

	//nbDePlace
	public int getNbDePlace() {
		return nbDePlace;
	}
	public void setNbDePlace(int nbDePlace) {
		this.nbDePlace = nbDePlace;
	}
	
	
	/* METHODES  */
	public String toXML(){
		//METHODES A ECRIRE NOOOO !!! 
		return null;
	}	
}