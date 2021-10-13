package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {
public static void main(String[] args) throws SQLException{
		
		String url = "jdbc:mysql://localhost?verifyServerCertificate=false&useSSL=true";
		final String usuario = "root";
		final String senha = "81238023";
		
		Connection conexao = DriverManager.getConnection(url, usuario, senha);
		System.out.println("Conexão efetuada com sucesso !"); 
		
		Statement stmt = conexao.createStatement();
		
		stmt.execute("CREATE DATABASE if not exists Curso_Java");
		System.out.println("Banco criado com sucesso");
		 
		conexao.close();
	}

}
