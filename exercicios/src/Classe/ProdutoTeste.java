package Classe;

public class ProdutoTeste {
	public static void main(String[] args) {
		
		Produto p1 = new Produto("notebook",4356.89);
		
		Produto p2 = new Produto();
		p2.nome = "Caneta Preta";
		p2.preco = 12.56;
	    
		Produto.desconto = 0.50 ;
		
		System.out.println(p1.nome + " " + p1.PrecoDesconto());
		System.out.println(p2.nome + " " + p2.PrecoDesconto(20.0));
		
		
		double precoFinal1 =  p1.PrecoDesconto();
		double precoFinal2 =  p2.PrecoDesconto();
		double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;
		
		System.out.printf("Média do carrinho = R$%.2f.", mediaCarrinho);
		
	}

}
