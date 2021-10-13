package OO.heranca.desafio;

public interface Esportivo {
	
	public void ligarTurbo();
	
	public void desligarTurbo();
	
	default int velocidadeDoTurbo(){
		return 1;
	}

}
