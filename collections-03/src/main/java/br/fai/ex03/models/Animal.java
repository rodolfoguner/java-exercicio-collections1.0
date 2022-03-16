package br.fai.ex03.models;

abstract class Animal {
	private String cor;
	private int idade;
	private String nome;
	
	public Animal (String cor, int idade, String nome) {
		this.cor = cor;
		this.idade = idade;
		this.nome = nome;
	}
	
	public Animal() {
		this.cor = "preto";
		this.idade = 5;
		this.nome = "não definido";
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getIdade() {
		return idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
