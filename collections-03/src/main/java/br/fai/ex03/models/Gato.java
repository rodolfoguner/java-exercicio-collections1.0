package br.fai.ex03.models;

public class Gato extends Animal {
	public Gato () {
		super();
		this.setCor("branco");
	}
	
	public Gato (String cor, int idade, String nome) {
		super(cor, idade, nome);
	}
	
	@Override
	public void som() {
		super.som();
		System.out.println("Eu gosto de miar.");
	}
	
	public void oQueFacoDuranteANoite() {
		System.out.println("Gosto de pular a cerca toda noite");
	}
}
