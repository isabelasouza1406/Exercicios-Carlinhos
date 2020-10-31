package com.infnet.edu.br;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		List<Carro> carros = new ArrayList<Carro>();

		boolean executando = true;
		while (executando) {
			Scanner sc = new Scanner(System.in);

			System.out.println("Adicione um chassi");
			String chassi = sc.next();
			System.out.println("Adicione uma cor");
			String cor = sc.next();
			System.out.println("Adicione a quantidade de portas");
			int portas = sc.nextInt();
			System.out.println("Adicione a placa");
			String placa = sc.next();

			Carro carro = new Carro(chassi, cor, portas, placa);
			carros.add(carro);

			System.out.println("Deseja cadastrar mais um carro?");
			String opcao = sc.next();
			executando = opcao.equalsIgnoreCase("s") ? true : false;
		}
		for (Carro carro : carros) {
			System.out.println(carro.getChassi()+" " + carro.getCor()+" " + carro.getPortas() + " portas " + carro.getPlaca());
		}
	}

}
