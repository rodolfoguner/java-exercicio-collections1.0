package br.fai.ex03;

import java.util.ArrayList;
import java.util.List;

import br.fai.ex03.models.Cachorro;
import br.fai.ex03.models.Gato;

public class Main {
	public static void main(String[] args) {
		Main app = new Main();
		app.start();
	}

	private void start() {
		Cachorro cachorro1 = new Cachorro("Totó");
		cachorro1.setCor("azul");
		Cachorro cachorro2 = new Cachorro("Pitoco");
		
		List<Cachorro> listaDeCachorros = new ArrayList<Cachorro>();
		
		listaDeCachorros.add(cachorro1);
		listaDeCachorros.add(cachorro2);
		
		for (Cachorro cachorro: listaDeCachorros) {
			cachorro.som();
			cachorro.dizerNome();
			cachorro.oQueGostoDeFazer();
			System.out.println("Cor do cachorro " + cachorro.getCor());
			System.out.println("-------------------------------------");
		}
		
		Gato gato1 = new Gato();
		Gato gato2 = new Gato("Verde");
		
		List<Gato> listaDeGatos = new ArrayList<Gato>();
		
		listaDeGatos.add(gato1);
		listaDeGatos.add(gato2);
		
		for (Gato gato: listaDeGatos) {
			gato.som();
			gato.dizerNome();
			gato.oQueFacoDuranteANoite();
			System.out.println("Cor do gato" + gato.getCor());
			System.out.println("-------------------------------------");
		}
	}
}
