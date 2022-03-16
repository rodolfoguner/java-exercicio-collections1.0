package br.fai.ex02;

import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		Main app = new Main();
		app.start();
	}

	private void start() {
		Map<String, String> cidades = new HashMap<String, String>();
		cidades.put("SRS", "Santa Rita do Sapucai");
		cidades.put("PA", "Pouso Alegre");
		cidades.put("ITA", "Itajuba");
		cidades.put("ZORO", "Conceicao dos Ouros");
		cidades.put("CAXU", "Cachoeira de Minas");
		
		exibeMapa(cidades);
	}
	
	private void exibeMapa(Map<String, String> cidades) {
		for (String keys: cidades.keySet()) {
			try {
			System.out.println("Key: " + keys + ", Valor: " + cidades.get(keys));
			} catch (Exception e) {
				System.out.println("Chave " + keys + " não existe");
			} finally {
				System.out.println("");
			}
		}		
	}
}
