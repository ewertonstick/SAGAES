package categoria;
import java.sql.Date;

public class Categoria{
	
	private int idCategoria;
	private String nome;
	private Date DataCadastro;
	
		
	public int getIdCategoria() {
		return idCategoria;
	}
	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}
	public Date getDataCadastro() {
		return DataCadastro;
	}
	public void setDataCadastro(Date dataCadastro) {
		DataCadastro = dataCadastro;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	}
	
