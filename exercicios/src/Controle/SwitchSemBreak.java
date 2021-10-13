package Controle;

public class SwitchSemBreak {
	public static void main(String[] args) {
		
		String Faixa = "Branca";
		
		switch(Faixa.toLowerCase()) {
		
		case "preta" :
			System.out.println("Sei o Bassai-Dai...");
		case "branca" :
			System.out.println("Sei o Tekki Shodan...");
		case "verde" :
			System.out.println("Sei o Heian Godan");
		}
		System.out.println("Fim");
	}

}
