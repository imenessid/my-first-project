package initialisation;

import java.util.Scanner;

public class MoyenneInvalue {

	public static void main(String[] args) {
				// Declaration des valeurs
			float a;
			float b;
			float c;
			float d;
			float e;
			float M;
			
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
			
			//Affichage résultat
			System.out.println("la Moyenne de "+a + "; "+b + ";" +c+ "; "+d+"; "+e+ " est égale à "+M);

		}

	

	}


