package app.entity;

import java.sql.Date;

public class Livro {
	
	private long id;
	private String titulo;
	private String autor;
	private int ano_publicacao;
	
	public Livro() {
		
	}
	
	public Livro(long id, String titulo, String autor, int ano) {
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.ano_publicacao = ano;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getAno_publicacao() {
		return ano_publicacao;
	}
	public void setAno_publicacao(int ano_publicação) {
		this.ano_publicacao = ano_publicação;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

}
