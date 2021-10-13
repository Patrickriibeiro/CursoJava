package OO.Composicao;

import java.util.ArrayList;

class Compra {
	
	String Cliente;
	
	ArrayList<Item> itens = new ArrayList<Item>();
	
	void AdicionarItens(String nome , int quantidade , double preco) {
		this.AdicionarItens(new Item(nome, quantidade, preco));
		
	}
	
	void AdicionarItens(Item item) {
		 itens.add(item);
		 item.compra = this;
	}
 
	double ValorTotal() {
		double total = 0;
		for(Item item: itens) {
				total += item.quantidade * item.preco;	
		}
		return total; 
	}
}
