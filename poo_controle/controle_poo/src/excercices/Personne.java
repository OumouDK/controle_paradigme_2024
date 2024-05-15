package excercices;

public abstract class Personne {
	public String nom ;
	public String prenom ;
	public int id ;
	
	
	
	public Personne(String nom, String prenom, int id) 
	{
		this.nom = nom;
		this.prenom = prenom;
		this.id = id ; 	
	}

	
	public String getNom(String nom){
		return this.nom ;
	}
	
	public String getPrenom(String prenom){
		return this.prenom ;
	}

	public int getId(String Id){
		return this.id ;
	}
	
	
	public String setNom(String nom){
		return this.nom  = nom;
	}
	
	public String setPrenom(String Prenom){
		return this.prenom = Prenom ;
	}
	
	public int setId(int Id){
		return this.id =  Id ;
	}
	
	
	
	
	
}
