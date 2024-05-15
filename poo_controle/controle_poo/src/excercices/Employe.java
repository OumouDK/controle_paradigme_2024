package excercices;

public class Employe extends Personne{
	public String poste ;
	public double salaire ; 
		
	public Employe(String nom, String prenom, int id, String poste, double salaire) {
		super(nom, prenom, id);
		this.poste = poste ;
		this.salaire = salaire ;	
		
	}


	
	
	
	public String getPoste(String poste){
		return this.poste;
	}
	
	
	
	public String setPoste(String poste){
		return this.poste =  poste ;
	}
	
	public double getSalaire(double salaire){
		return this.salaire;
	}
	
	public double setSalaire(double salaire){
		return this.salaire =  salaire ;
	}
	
	public void afficherDetails(){
		System.out.println("Titre :"+this.nom);
		System.out.println("Auteur :"+this.prenom);
		System.out.println("Id :"+this.id);
		System.out.println("poste :"+this.poste);
		System.out.println("salaire :"+this.salaire);
	}

}
