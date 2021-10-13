package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoas {

	public static void main(String[] args) throws SQLException {

		Scanner entrada = new Scanner(System.in);

		Connection conexao = FabricaConexao.getConexao();

		String deleteSql = "Delete from pessoas where codigo = ?";

		System.out.println("Qual id deseja excluir ?");
		int codigo = entrada.nextInt();

		PreparedStatement stmt = conexao.prepareStatement(deleteSql);
		stmt.setInt(1, codigo);
		
		int contador = stmt.executeUpdate();

		if (contador > 0) {
			System.out.println("Foi excluido o código no banco de dados");
			System.out.println("Numero de linhas alteradas = " + contador);
		} else {
			System.out.println("nada mudou");
		}

		entrada.close();
		conexao.close();

	}

}
