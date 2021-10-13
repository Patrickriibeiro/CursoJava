package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa {
	public static void main(String[] args) throws SQLException {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o nome : ");
		String nome = entrada.nextLine();
		
	    Connection conexao = FabricaConexao.getConexao();
	    
	    String sql = "Insert INTO PESSOAS (nome) Values (?)";
	    PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setNString(1, nome);
		
		
		stmt.execute();
		
		System.out.println("Pessoa incluida com sucesso");
		
		entrada.close();
		
		
	}

}
