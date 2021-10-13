package Armazem;

import java.sql.Connection;
import java.sql.DriverManager;


public class StarterBd {

	public static Connection GetConexao() {
		try {

			final String url = "jdbc:mysql://localhost:8080/loja?verifyServerCertificate=false&useSSL=true";
			final String usuario = "root";
			final String senha = "81238023";

			return DriverManager.getConnection(url, usuario, senha);

		} catch (Exception e) {

			throw new RuntimeException(e);

		}

	}

}
