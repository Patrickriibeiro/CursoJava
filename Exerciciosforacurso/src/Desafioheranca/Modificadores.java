package Desafioheranca;

public interface Modificadores {
	
	void ligarTurbo();
	
	void desligarTurbo();
	
	default String ligarArCondicionado(int temperatura) {
		if(temperatura == 1) {
			return "Sua temperatura est� em 28 graus";
		}if(temperatura == 2) {
			return "Sua temperatura est� em 20 graus";
		}else {
			return "Sua temperatura est� em 18 graus";
		}
		
	}
	
	default String desligarArCondionado() {
		return "Desligou ArCondicionado";
	}

}
