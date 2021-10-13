package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class FabricaConexao {

	public static Connection getConexao()   {
		try {
			Properties prop = getProperties();
			String url = prop.getProperty("BANCO.URL");
			final String usuario = prop.getProperty("BANCO.USUARIO");
			final String senha = prop.getProperty("BANCO.SENHA");

			return DriverManager.getConnection(url, usuario, senha);
		} catch (SQLException | IOException e) {

			throw new RuntimeException(e);

		}
	}
	public static Properties getProperties() throws IOException{
		Properties prop = new Properties();
		
		String caminho = "/conexao.properties";
		
		prop.load(FabricaConexao.class.getResourceAsStream(caminho));
		
		return prop;
	}

}
