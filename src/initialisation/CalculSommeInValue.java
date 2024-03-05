package initialisation;

import java.util.Scanner;

public class CalculSommeInValue {

	public static void main(String[] args) {
		// Declaration des valeurs
		int a;
		int b;
		int c;
		//Initialisation des valeurs
		Scanner Clavier=new Scanner(System.in);
		System.out.println("veuillez saisir la valeur de a");
		a=Clavier.nextInt();
		System.out.println("veuillez saisir la valeur de b");
		b=Clavier.nextInt();
		Clavier.close();
		//Action
		c=a+b;
		
		//Affichage résultat
		System.out.println("la somme de "+a + "et "+b + "est égale à "+c);

	}

}