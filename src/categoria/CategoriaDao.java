package categoria;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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

		String sql = "INSERT INTO categoria (idCategoria,nome, DataCadastro) VALUES (?,?,?,?)";
		PreparedStatement stmt;
		try {
			stmt = connection.prepareStatement(sql);
			stmt.setint(1 , Categoria.getIdCategoria());
			stmt.setString(2 , Categoria.nome());
            stmt.setDate(3, new java.sql.Date(Categoria.getDataCadastro().getTime()));
       
			stmt.execute();
			connection.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}

