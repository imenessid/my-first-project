package initialisation;

import java.util.Scanner;
import java.lang.Math;
public class Puissance {

	public static void main(String[] args) {
		// Declaration des variables
		int a = 0,b = 0;
		double res=1;
		
		int i;
		
		
			//initialisation des variables
			 Scanner Console=new Scanner(System.in);
				 
				 
			       
				 try {
					 System.out.println("veuillez saisir le premier Entier a");
					 a = Console.nextInt();
				 }
				 catch(Exception e){
					    System.out.println("La valeur rentrée n'était pas du type voulu");
					    			System.exit(a);		}
				 
			             
				// System.out.println("veuillez saisir la puissance b");
				 
				try
			        {
					System.out.println("veuillez saisir la puissance b");
					b= Console.nextInt();
			        }
				 catch(Exception e){
					    System.out.println("La valeur rentrée n'était pas du type voulu");
					    			System.exit(b);		}
				Console.close();
						//Action
						if (b>0)  {
							
						for(i=0;i<b;i++) {
						res=Math.pow(a, b);
							}
	System.out.println("a puissance b est égale à" + res);
	}
						else System.out.println("impossible de calculer!!");
	}
}


