package Classe;

public class DataTeste {
	public static void main(String[] args) {
	
		Data data = new Data();
		
		Data data2 = new Data(3,4,2000);
		
		System.out.println("Hoje � " + data.ObterDataFormatada());
		
		System.out.println("Hoje � " + data2.ObterDataFormatada());
		
		
	}
}