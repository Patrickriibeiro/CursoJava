package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AlterarNomePessoa {
	public static void main(String[] args) throws SQLException {
		Scanner entrada = new Scanner(System.in);
		Connection conexao = FabricaConexao.getConexao();

		System.out.println("Informe o código da pessoa ");
		int codigo = entrada.nextInt();

		String select = "select * from pessoa where codigo = ?";
		String update = "Update pessoas SET nome = ? , Where codigo = ?";

		PreparedStatement stmt = conexao.prepareStatement(select);
		stmt.setInt(1, codigo);

		ResultSet r = stmt.executeQuery();

		if (r.next()) {
			Pessoa p = new Pessoa(r.getInt(1), r.getString(2));

			System.out.println("Nome da pessoa é :" + p.getNome());
			entrada.nextLine();

			System.out.println("Insira o novo nome : ");
			String novoNome = entrada.nextLine();
			stmt.close();

			stmt = conexao.prepareStatement(update);
			stmt.setNString(1, novoNome);
			stmt.setInt(2, codigo);

			stmt.execute();

			System.out.println("Nome alterado com Sucesso");

			stmt.close();

		}
		conexao.close();
		entrada.close();

	}

}
