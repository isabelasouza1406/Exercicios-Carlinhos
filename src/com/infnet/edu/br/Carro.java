package com.infnet.edu.br;

public class Carro {

	private String nome;
	private String chassi;
	private String cor;
	private int portas;
	private String placa;

	public Carro(String nome) {
		this.nome = nome;
	}

	public Carro(String chassi, String cor, int portas, String placa) {
		this.chassi = chassi;
		this.cor = cor;
		this.portas = portas;
		this.placa = placa;
	}

	public void adicionarCarro(String nome) {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getPortas() {
		return portas;
	}

	public void setPortas(int portas) {
		this.portas = portas;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}


}
