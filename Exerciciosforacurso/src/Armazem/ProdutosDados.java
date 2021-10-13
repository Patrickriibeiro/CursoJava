package Armazem;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ProdutosDados {
	
	public static void main(String[] args) throws SQLException {
	
		Connection conexao = StarterBd.GetConexao();
		
		String sql = "Create Table  if not exists Produtos ("
				+ "id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,"
				+ "Produto VARCHAR(100) NOT NULL ,"
				+ "Preco Double NOT NULL";
				
		Statement stmt = conexao.createStatement();
		stmt.execute(sql);
		
		System.out.println("Tabela criada com successo");
		
	    conexao.close();
		
	}
	

}
