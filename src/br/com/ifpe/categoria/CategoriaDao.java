package br.com.ifpe.categoria;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CategoriaDao {

	private Connection connection;

	public CategoriaDao() {
		try {
			this.connection = new ConnectionFactory().getConnection();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void salvar(Categoria categoria) {

		try {
			String sql = "INSERT INTO categoria (Nome) VALUES (?)";
			PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.setString(1, categoria.getNome());

			stmt.execute();
			connection.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);

		}

	}

	public List<Categoria> getLista() {
		try {
			List<Categoria> categoria = new ArrayList<Categoria>();
			String sql = "SELECT * FROM categoria";
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Categoria categoria1 = new Categoria();
				categoria1.setNome(rs.getString("Nome"));
				categoria1.setIdCategoria(rs.getInt("IdCategoria"));
				categoria1.setDataCadastro(rs.getDate("DataCadastro"));
				categoria.add(categoria1);
			}
			rs.close();
			stmt.close();
			connection.close();
			return categoria;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public Categoria exibir(int idCategoria) {

		try {
			String sql = "SELECT * from categoria WHERE idCategoria=?";
			Categoria c = null;
			PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.setInt(1, idCategoria);

			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				c = new Categoria();
				c.setNome(rs.getString("Nome"));
				c.setIdCategoria(rs.getInt("idCategoria"));
			}
			rs.close();
			stmt.close();
			return c;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void altera(Categoria categoria) {

		try {
			String sql = "UPDATE categoria set Nome=? WHERE idCategoria=?";
			PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.setString(1, categoria.getNome());
			stmt.setInt(2, categoria.getIdCategoria());
			
			stmt.execute();
			stmt.close();
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void remover(int idCategoria) {

		try {
			String sql = "DELETE FROM categoria WHERE idCategoria = ?";
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, idCategoria);
			stmt.execute();
			connection.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
