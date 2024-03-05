package initialisation;

import java.util.Scanner;

public class Factoriel {

	public static void main(String[] args) {
		// Declaration des variables
		int i;
		int a = 0;
		double res;

		// initialisation des valeurs
		Scanner Console = new Scanner(System.in);

		try {
			System.out.println("veuillez saisir l'entier a");
			a = Console.nextInt();
		} catch (Exception e) {
			System.out.println("La valeur rentrée n'est pas du type Entier");
			System.exit(a);
		}
		Console.close();
		if (a >= 0) {
			res = 1;
			for (i = 1; i <= a; i++) {
				res = res * i;
			}
			System.out.println("le factoriel de " + a + " est " + res);
		} else {
			System.out.println("impossible de calculer!!");
		}
	}
}
