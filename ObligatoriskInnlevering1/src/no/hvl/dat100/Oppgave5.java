package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Oppgave5 {

	public static String finnKarakter(int poengsum) {
		
		String resultat; 

		if (poengsum >= 0 && poengsum < 39) {
			resultat = "Du får karakter F!";
		}

		else if (poengsum >= 40 && poengsum < 49) {
			resultat = "Du får karakter E!";
		}

		else if (poengsum >= 50 && poengsum < 59) {
			resultat = "Du får karakter D!";
		}

		else if (poengsum >= 60 && poengsum < 79) {
			resultat = "Du får karakter C!";
		}

		else if (poengsum >= 80 && poengsum < 89) {
			resultat = "Du får karakter B!";
		}

		else if (poengsum >= 90 && poengsum <= 100) {
			resultat = "Du får karakter A!";
		}

		else {
			resultat = "Ugyldig";
		}

		return resultat;

	}

	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			
			String poengsumTxt = showInputDialog("Skriv inn poengsum på prøve: ");
			System.out.println("Poengsum: " + poengsumTxt);

			int poengsum = Integer.parseInt(poengsumTxt);
			
			String resultat = finnKarakter(poengsum);
			
			if(resultat.equals("Ugyldig")) {
				int nyPoengsum = -1;
				while (nyPoengsum < 0 || nyPoengsum > 100) {
					String nyPoengTxt = showInputDialog("Ugyldig, skriv inn poengsum på nytt: ");
					System.out.println("Ny poengsum: " + nyPoengTxt);

					nyPoengsum = Integer.parseInt(nyPoengTxt);
				}
				resultat = finnKarakter(nyPoengsum);
			}
			
			showMessageDialog(null, resultat);
			
		}



	}

}
