package Armazem;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class MetodsProdutos {

	Connection conexao = StarterBd.GetConexao();

	public String SetDadosTabela(String produto, String preco) {
		try {
			String sql;
			Statement stmt = conexao.createStatement();

			sql = "Insert INTO Produtos (Produto , Preco)" +  "Values ( " + produto + "  ,  " + preco + ");";

			stmt.execute(sql);
			
			return "Produto : " + produto + "e preco :" + preco + " inserido na tabela.";
		} catch (SQLException e) {
			return "ruim";
		}
	}

}
