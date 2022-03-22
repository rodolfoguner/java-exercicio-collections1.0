package br.fai.ex04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import br.fai.ex04.models.Cachorro;
import br.fai.ex04.models.Gato;

public class Main {
	public static void main(String[] args) {
		Main app = new Main();
		app.start();
	}

	private void start() {
		Collection<Object> listaDeAnimais = new ArrayList<>();
		listaDeAnimais.add(new Cachorro("Tot�"));
		listaDeAnimais.add(new Cachorro("Pitoco", "Azul"));
		listaDeAnimais.add(new Gato());
		listaDeAnimais.add(new Gato("Verde"));
		
		listaDeAnimais.forEach(obj -> {
			System.out.println(obj);
		});
		
	}
	
}
