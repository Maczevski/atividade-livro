package app.entity;

public class Biblioteca {
	
	private long id;
	private String endereco;
	private String telefone;
	
	public Biblioteca() {
		
	}
	
	public Biblioteca(long id, String endereco, String telefone) {
		super();
		this.id = id;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
}
