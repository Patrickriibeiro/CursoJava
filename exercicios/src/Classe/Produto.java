package Classe;

public class Produto {
	
	String nome;
	double preco;
	static double desconto = 0.29;
	
	Produto(){
		
	}
	
	Produto(String NomeProduto){
		
	}
	
	Produto(String NomeProduto,double PrecoProduto){
		nome = NomeProduto;
		preco = PrecoProduto;
		
		
	}
	
	double PrecoDesconto() {
		
		return preco * (1 - desconto );

	}
	
	double PrecoDesconto(double DescontoDoGerente) {
	
	return preco * (1 - desconto + DescontoDoGerente);

}
}
