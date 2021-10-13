package OO.heranca.desafio;

public interface Luxo {
	
	void ligarArcondicionado();
	
	void desligarArcondicionado();
	
	default int velocidadeDoAr(){
		return 1;
	}

}
