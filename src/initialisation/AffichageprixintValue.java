package initialisation;

import java.util.Scanner;

public class AffichageprixintValue {

		public static void main(String[] args) {
		// Declaration variables
		double  PF,P =0 ;
					
		 int  T= 0 ;
		 
		 //initialisation des variables
		 Scanner Console=new Scanner(System.in);
		 
			        
			 try {
				 System.out.println("veuillez saisir le type d'article");
				 T = Console.nextInt();
			 }
			 catch(Exception e){
				    System.out.println("La valeur rentrée n'était pas du type voulu");
				    System.exit(T);
				}
		             
			 	 
			try
		        {
				System.out.println("veuillez saisir le prix d'article");
		         P= Console.nextDouble();
		        }
			 catch(Exception e){
				    System.out.println("La valeur rentrée n'était pas du type voulu");
				    System.exit(0);
				}
			
					Console.close();
				
					   	             
				//condition et Action
				
			if (T==1) {
				 PF=P* 0.8;
				System.out.println("le nouveau Prix est soldé de 20% " + PF);
			}
			else if (T==2)  {
				PF= P * 0.6;
				System.out.println("le nouveau Prix est soldé de 40% " + PF);
			}
			else if (T==3) {
				PF=P * 0.4;
				System.out.println("le nouveau Prix est soldé de 60% " + PF);
			}
			else 
				System.out.println("Le prix est non soldé " +P);
				
		}

	
		}
	


	