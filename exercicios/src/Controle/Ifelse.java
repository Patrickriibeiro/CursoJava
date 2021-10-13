package Controle;

import javax.swing.JOptionPane;

public class Ifelse {
	
	public static void main(String[] args) {
		
		String Valor = JOptionPane.showInputDialog("Informe seu numero");
		
		int numero = Integer.parseInt(Valor);
		
		if (numero % 2 == 0) {
			System.out.println("numero par !");
			
		} else {
			System.out.println("numero ímpar !");
		}
	}

}
