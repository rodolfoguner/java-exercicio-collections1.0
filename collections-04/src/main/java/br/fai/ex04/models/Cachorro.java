package br.fai.ex04.models;

public class Cachorro extends Animal {
	
	public Cachorro (String nome) {
		super();
		this.setNome(nome);
	}
	public Cachorro (String nome, String cor) {
		super();
		this.setNome(nome);
		this.setCor(cor);
	}
	
	@Override
	public void som() {
		System.out.println("Eu gosto de latir");
	}
	
	public void oQueGostoDeFazer() {
		System.out.println("Gosto de morder carteiros.");
	}
}
