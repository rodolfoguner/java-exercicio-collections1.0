package br.fai.ex04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import br.fai.ex04.models.Cachorro;
import br.fai.ex04.models.Gato;
import br.fai.ex04.models.Animal;

public class Main {
	public static void main(String[] args) {
		Main app = new Main();
		app.start();
	}

	private void start() {
		List<Animal> listaDeAnimais = new ArrayList<Animal>();
		listaDeAnimais.add(new Cachorro("Toto"));
		listaDeAnimais.add(new Cachorro("Pitoco", "Azul"));
		listaDeAnimais.add(new Gato());
		listaDeAnimais.add(new Gato("Verde"));
		
		listaDeAnimais.forEach(obj -> {
			obj.som();
			obj.dizerNome();
			if (obj.getClass().getName().equals("Cachorro")) {
				Cachorro cachorro = (Cachorro) obj;
				cachorro.oQueGostoDeFazer();
			} else if (obj.getClass().getName().equals("Gato")){
				Gato gato = (Gato) obj;
				gato.oQueFacoDuranteANoite();
			}
			
			System.out.println();
			System.out.println("--------------------");
			
		});
		
	}
	
}
