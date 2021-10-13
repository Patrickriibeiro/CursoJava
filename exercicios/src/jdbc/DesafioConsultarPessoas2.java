package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DesafioConsultarPessoas2 {

	public static void main(String[] args) throws SQLException {

		Scanner entrada = new Scanner(System.in);

		Connection conexao = FabricaConexao.getConexao();
		String Sql = "Select * from pessoas Where nome like ?";

		System.out.println("Informe o valor para pesquisa : ");
		String valor = entrada.nextLine();

		PreparedStatement stmt = conexao.prepareStatement(Sql);
		ResultSet resultado = stmt.executeQuery(Sql);
		stmt.setString(1, "%" + valor + "%");
		List<Pessoa> pessoas = new ArrayList<>();

		while (resultado.next()) {
			int codigo = resultado.getInt("codigo");
			String nome = resultado.getNString("nome");
			pessoas.add(new Pessoa(codigo, nome));
		}

		for (Pessoa p : pessoas) {
			System.out.println(p.getCodigo() + " ===>" + p.getNome());
		}

		stmt.close();
		conexao.close();
		entrada.close();

	}

}
