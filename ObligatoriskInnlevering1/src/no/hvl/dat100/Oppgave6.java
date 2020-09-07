package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppgave6 {


    public static void main(String[] args) {
    	
    	String heltallTxt = showInputDialog("Skriv inn tall: ");
		
		int heltall = Integer.parseInt(heltallTxt); 
		long fakultet = 1;
		for(int i = 1; i <= heltall; i++) {
			fakultet = fakultet * i; 
		}
		showMessageDialog(null, "Fakultet for " + heltall + " er " + fakultet);
		
	
    	
    	
    }

}
