package initialisation;

import java.util.Scanner;

public class ConditionMoyenneintValue {

	public static void main(String[] args) {
		// Declaration des valeurs
		float a,b,c,d,e,M;
		
		
		//Initialisation des valeurs
		Scanner Clavier=new Scanner(System.in);
		
		System.out.println("veuillez saisir la valeur de a");
		a=Clavier.nextFloat();
		
		System.out.println("veuillez saisir la valeur de b");
		b=Clavier.nextFloat();
		
		System.out.println("veuillez saisir la valeur de c");
		c=Clavier.nextFloat();
		
		System.out.println("veuillez saisir la valeur de d");
		d=Clavier.nextFloat();
		
		System.out.println("veuillez saisir la valeur de e");
		e=Clavier.nextFloat();
		
		Clavier.close();
		//Action
		M=a+b+c+d+e/5;
		//Condition et Affichage
		if (M>15)
		{System.out.println("passage vers le niveau suivant");
		}
		else if (M<10)
		{System.out.println("Echec!!!");
		}
		else 
		{System.out.println("refaire les modules dont les notes <12");
		}
		
		

	}

}
