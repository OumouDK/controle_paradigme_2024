package excercices;

public class Livre {
	 public String titre ;
	 public String auteur ;
	 public String isbn ;
	 public boolean disponible ;
	 
	 
	 public Livre(String titre, String auteur, String isbn, boolean disponible) {
		this.titre = titre; 
		this.auteur = auteur ;
		this.isbn = isbn ;
		
		// faire condition
		this.disponible = disponible ;
		
	 }


		public String getTitre(String titre){
			return this.titre ;
		}
		
		public String getAuteur(String auteur){
			return this.auteur ;
		}

		public String getIsbn(String isbn){
			return this.isbn ;
		}
		
		public boolean getDisponible(boolean disponible) {
			return this.disponible;
			 
		}
		
		
		public String setTitre(String titre){
			return this.titre  = titre;
		}
		
		public String setAuteur(String auteur){
			return this.auteur = auteur ;
		}
		
		public String setIsbn(String Isbn){
			return this.isbn =  Isbn ;
		}
		
		
		public void afficherDetails(String titre) {
			System.out.println("Titre :"+this.titre);
			System.out.println("Auteur :"+this.auteur);
			System.out.println("Isbn :"+this.isbn);
			System.out.println("Est disponible ? :"+this.disponible);
	
		}
}
