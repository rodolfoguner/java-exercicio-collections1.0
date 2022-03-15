package br.fai.ex01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main app = new Main();
		app.start();
	}

	private void start() {
		int i = 0;
		List<String> valoresDigitados = new ArrayList<String>();
		
		while (i < 5) {
			String valorDigitado = "";

			System.out.print("Digite algum valor: ");
			valorDigitado = obterDados();
			
			if (!valorDigitado.trim().isEmpty() && !valorDigitado.equals("INVALIDO")) {
				valoresDigitados.add(valorDigitado);
				i++;
			}
		}
		
	}
	
	private String obterDados() {
		Scanner scanner = new Scanner(System.in);
		String valor;
		try {
			valor = scanner.nextLine();
		} catch (Exception e) {
			valor = "INVALIDO";
		}
		
		return valor;
	}
}
