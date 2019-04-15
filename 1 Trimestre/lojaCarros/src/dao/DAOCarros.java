package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import entidade.Carro;

public class DAOCarros {
	Scanner scan = new Scanner(System.in);
	Carro carros = new Carro();

	public void manipularCarros() {
		String url = "jdbc:mysql://localhost:3306/bancoCarro?useTimezone=true&serverTimezone= UTC";
		String usuario = "root";
		String senha = "";

		try {
			Connection conn = DriverManager.getConnection(url, usuario, senha);
			Statement st = conn.createStatement();

			int opcao = 0;
			do {
				System.out.println("\n" + "Insira uma opcação\n" + "1-Inserir\n" + "2-Listar\n" + "3-Alterar\n"
						+ "4-Excluir\n" + "5-Sair");
				opcao = scan.nextInt();
				scan.nextLine();
				if (opcao == 1) {
					System.out.println("Nome do carro:");
					carros.setNome(scan.nextLine());
					System.out.println("Modelo do carro:");
					carros.setModelo(scan.nextLine());
					System.out.println("Marca do carro:");
					carros.setMarca(scan.nextLine());
					System.out.println("Ano do carro:");
					carros.setAno(scan.nextInt());
					st.executeUpdate("INSERT INTO CARRO(NOME,MODELO,MARCA,ANO)VALUES('" + carros.getNome() + "','"
							+ carros.getModelo() + "','" + carros.getMarca() + "','" + carros.getAno() + "')");
				} else if (opcao == 2) {

					ResultSet rs = st.executeQuery("SELECT * FROM CARRO");
					while (rs.next()) {
						System.out.println(rs.getString("id") + "-" + rs.getString("nome"));
					}
				}
			} while (opcao != 5);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
