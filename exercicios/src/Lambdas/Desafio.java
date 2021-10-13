package Lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
	
	public static void main(String[] args) {
		
	
	
	
	Function<Produto , Double> precoFinal =
			p -> p.preco * (1 - p.desconto);
			
	UnaryOperator<Double> impostoMunicipal =
			v -> v >= 2500 ? v * 1.085 : v ;
			
	UnaryOperator<Double>frete =
			preco -> preco >= 300 ? preco + 100 : preco + 50;
			
	UnaryOperator<Double> arredondar =
			preco -> Double.parseDouble(String.format("%.2f" ,preco));
			
	Function<Double, String> formatar =
			preco -> ("Real" + preco).replace(".", ",");
	
	Produto p = new Produto("Ipad",3235.89,0.50);
	
	String preco = precoFinal
			.andThen(impostoMunicipal)
			.andThen(frete)
			.andThen(arredondar)
			.andThen(formatar)
			.apply(p);
	
	System.out.println("O preco final é : " + preco);
	
	}
}
