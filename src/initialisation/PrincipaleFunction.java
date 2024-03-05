package initialisation;

import java.util.Scanner;

public class PrincipaleFunction {
	
	static void AfficheprixArticlesolde(double prixArticle, double tauxsolde)
	{double prixsolde;
	prixsolde=(1-tauxsolde/100)*prixArticle;
	System.out.println("Le prix de l'Article est" +prixsolde +"d");
	}

	public static void main(String[] args) {
		// declaration des variables
		double prixintial=0;
		double tauxsolde=0;
		Scanner Clavier=new Scanner(System.in);
		System.out.println("Entrez le prix de l'article non soldé");
		prixintial=Clavier.nextDouble();
		System.out.println("Entrez le taux du solde");
		tauxsolde=Clavier.nextDouble();
		Clavier.close();
		 AfficheprixArticlesolde(prixintial,tauxsolde); // Appel de la fonction
		
		
		
		

	}

}
