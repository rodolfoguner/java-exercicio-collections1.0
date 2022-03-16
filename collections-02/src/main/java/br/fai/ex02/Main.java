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
		
		exibeValorEspecifico(cidades, "ZORO");
		exibeValorEspecifico(cidades, "MG");
		
		cidades.replace("SRS", "Santa Rita");
		
		exibeMapa(cidades);
		
	}
	
	private void exibeMapa(Map<String, String> cidades) {
		for (String keys: cidades.keySet()) {
			exibeValorEspecifico(cidades, keys);
		}		
	}
	
	private void exibeValorEspecifico(Map<String, String> cidades, String chave) {
		try {
			System.out.println("Valor da chave " + chave + " é " + cidades.get(chave));
		} catch (Exception e){
			System.out.println("Chave " + chave + " não existe");
		} finally {
			System.out.println();
		}
	}
}
