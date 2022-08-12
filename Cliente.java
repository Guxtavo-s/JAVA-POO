package com.generation.cliente.model;

public class Cliente {

	private String nome;
	private int CPF;
	private int cel;
	private double gasto;
	private String endereco;
	
	public Cliente(String nome, int cPF, int cel, double gasto, String endereco) {
		this.nome = nome;
		CPF = cPF;
		this.cel = cel;
		this.gasto = gasto;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCPF() {
		return CPF;
	}

	public void setCPF(int cPF) {
		CPF = cPF;
	}

	public int getCel() {
		return cel;
	}

	public void setCel(int cel) {
		this.cel = cel;
	}

	public double getGasto() {
		return gasto;
	}

	public void setGasto(double gasto) {
		this.gasto = gasto;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public void visualizar () {
		System.out.println("--------------------------------------------");
		System.out.println("Dados do cliente: ");
		System.out.println("--------------------------------------------");
		System.out.println("Nome do cliente: "+this.nome);
		System.out.println("CPF do cliente: "+this.CPF);
		System.out.println("Número celular do cliente: "+this.cel);
		System.out.println("Endereco do cliente: "+this.endereco);
		System.out.println("Gasto do cliente: "+this.gasto);
		
	}
	
	
	
}
