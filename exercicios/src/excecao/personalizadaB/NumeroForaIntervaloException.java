package excecao.personalizadaB;

@SuppressWarnings("serial")
public class NumeroForaIntervaloException extends Exception {
	
	private String nomeDoAtributo;
	
	public NumeroForaIntervaloException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
		
	}
	
	public String getMessage() {
		return String.format("O atributo %5 está fora do intervalo" , nomeDoAtributo);
	}

}
