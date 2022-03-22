package br.fai.ex04.models;

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
	
	public void som() {
		System.out.println("O som padrão desse animal é: zzzz");
	}
	
	public void dizerNome() {
		System.out.println("Nome do animal: " + this.getNome());
	}
	
	public void dizerMinhaIdade() {
		System.out.println("Minha idade é: " + this.getIdade());
	}
}
