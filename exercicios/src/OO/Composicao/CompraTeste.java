package OO.Composicao;

public class CompraTeste {
	public static void main(String[] args) {
		
	Compra compras1 = new Compra();
    compras1.Cliente = "João Pedro";
    compras1.AdicionarItens("Caneta",20,7.45);
    compras1.AdicionarItens(new Item("Borracha", 12 , 3.89));
    compras1.AdicionarItens(new Item("Caderno",3,18.79));
    
    System.out.println(compras1.itens.size());
    System.out.println(compras1.ValorTotal());
	
    
	}
}
