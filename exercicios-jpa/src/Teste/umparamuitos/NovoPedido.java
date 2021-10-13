package Teste.umparamuitos;

import Teste.umpraumparamuitos.ItemPedido;
import Teste.umpraumparamuitos.Pedido;
import infra.DAO;
import modelo.basico.Produto;

public class NovoPedido {

	public static void main(String[] args) {

		DAO<Object> dao = new DAO<>();

		Produto produto = new Produto("Geladeira", 2788.12);

		Pedido pedido = new Pedido();

		ItemPedido item = new ItemPedido(10, pedido, produto);
		
		System.out.println(item);

		dao.abrirT().incluir(pedido).incluir(produto).incluir(pedido).FecharT().fechar();

	}
}
