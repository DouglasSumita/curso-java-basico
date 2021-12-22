package com.sumitad.cursojava.aula24;

public class Livro {
    
	private String nome;
	private String idioma;
	private Integer qtdPaginas;
	private String editora;
	
	public Livro(String nome, String idioma, Integer qtdPaginas, String editora) {
		this.nome = nome;
		this.idioma = idioma;
		this.qtdPaginas = qtdPaginas;
		this.editora = editora;
	}

	public Livro() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public Integer getQtdPaginas() {
		return qtdPaginas;
	}

	public void setQtdPaginas(Integer qtdPaginas) {
		this.qtdPaginas = qtdPaginas;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	@Override
	public String toString() {
		return "Livro [nome=" + nome + ", idioma=" + idioma + ", qtdPaginas=" + qtdPaginas + ", editora=" + editora
				+ "]";
	}
}
