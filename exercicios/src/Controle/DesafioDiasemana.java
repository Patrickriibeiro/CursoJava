package Controle;

import javax.swing.JOptionPane;

public class DesafioDiasemana {
	public static void main(String[] args) {
		
		String DiaSemana = JOptionPane.showInputDialog("Digite um dia");
		
		
		if(DiaSemana.contains("1")) {	
			System.out.println("Domingo");	
		} else if(DiaSemana.contains("2")) {
			System.out.println("Segunda");
		} else if (DiaSemana.contains("3")) {
			System.out.println("Terca");	
		} else if (DiaSemana.contains("4")) {
			System.out.println("Quarta");
		}else if (DiaSemana.contains("5")) {
			System.out.println("Quinta");
		}else if (DiaSemana.contains("6")) {
			System.out.println("Sexta");
		}else if (DiaSemana.contains("7")) {
			System.out.println("Sabado");
		}

//if("Segunda".equalsIgnoreCase(Dia)) {	
	}
}
