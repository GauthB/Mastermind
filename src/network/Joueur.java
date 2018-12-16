package network;

public class Joueur {
	private String nom;
	public int combi;
	
	public Joueur(String nom) {
		this.nom=nom;
		this.combi=0000;
	}
	
	public int getCombi() {
		return combi;
	}

	public void setCombi(int combi) {
		this.combi = combi;
	}

	public String toString(Joueur joueur){
		return("nom: "+ joueur.nom);
	}
}