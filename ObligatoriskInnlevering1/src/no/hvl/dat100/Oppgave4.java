package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Oppgave4 {
	

	public static void main(String[] args) {
		
		final double trinn1 = 1.9/100;
		final double trinn2 = 4.2/100;
		final double trinn3 = 13.2/100;
		final double trinn4 = 16.2/100;
		
		
		String bruttoinntektTxt = showInputDialog("Skriv inn bruttoinntekt: "); 
		System.out.println("Inntekt: " + bruttoinntektTxt);
		
		int bruttoinntekt = Integer.parseInt(bruttoinntektTxt); 
		
		String resultat;
		
		if (bruttoinntekt > 0 && bruttoinntekt < 180800) {
			resultat = "Du slipper trinnskatt!";
		}
		
		else if (bruttoinntekt >= 180800 && bruttoinntekt < 254500) {
			double trinnskatt = bruttoinntekt * trinn1;
			
			resultat = "Du er på trinn 1 og må betale trinnskatt på kroner: " + trinnskatt;
		}
		
		else if (bruttoinntekt >= 254500 && bruttoinntekt < 639750) {
			double trinnskatt = bruttoinntekt * trinn2;
			
			resultat = "Du er på trinn 2 og må betale trinnskatt på kroner: " + trinnskatt;
		}
		
		else if (bruttoinntekt >= 639750 && bruttoinntekt < 999550) {
			double trinnskatt = bruttoinntekt * trinn3;
			
			resultat = "Du er på trinn 3 må betale trinnskatt på kroner: " + trinnskatt;
		}
		
		else if (bruttoinntekt >= 999550) {
			double trinnskatt = bruttoinntekt * trinn4;
			
			resultat = "Du er på trinn 4 og må betale trinnskatt på kroner: " + trinnskatt;
		}
		
		else resultat = "Klarte ikke beregne trinnskatt";
		
		showMessageDialog(null, resultat);

	}

}
