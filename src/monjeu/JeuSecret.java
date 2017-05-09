package monjeu;

import java.util.Random;
import java.util.Scanner;

public class JeuSecret {

	public static void main(String[] args) {
		
		long nbSaisie,nbSecret,nbCoup=1;
		
		Random r = new Random();
		nbSecret = r.nextInt(100);
		
		nbSecret = 98;
		Scanner clavier = new Scanner(System.in);
		System.out.println(nbSecret);
	
		
		do {
		System.out.println("Entrez le nombre secret : ");
		nbSaisie = clavier.nextInt();
		if(nbSaisie < 0 || nbSaisie > 100)
			System.out.println("Veuillez respecter l'intervale [0;100]");
		if(nbSaisie < nbSecret && nbSaisie > 0)
			System.out.println("le nombre saisie est inférieur au nombre secret");
		if(nbSaisie> nbSecret && nbSaisie <= 100)
			System.out.println("le nombre saisie est supérieur au nombre secret");
		if(nbSaisie == nbSecret){
			System.out.println("Bravo vous avez trouvé en "+nbCoup+" coup(s)");
			nbSaisie = 0;
		}
		nbCoup++;
		} while (nbSaisie != 0);	
	}
}

