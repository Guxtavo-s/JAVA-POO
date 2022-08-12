package com.generation.paciente;

public class Paciente {
		private String nome;
		private String sobrenome;
		private String sexo;
		private int idade;
		private int celular;
		private String cpf;
		private String situacao;
		
		public Paciente(String nome, String sobrenome, String sexo, int idade, int celular, String cpf, String situacao) {
			this.nome = nome;
			this.sobrenome = sobrenome;
			this.sexo = sexo;
			this.idade = idade;
			this.celular = celular;
			this.cpf = cpf;
			this.situacao = situacao;
		}
		
		public Paciente() {
			
		}
		
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getSobrenome() {
			return sobrenome;
		}
		public void setSobrenome(String sobrenome) {
			this.sobrenome = sobrenome;
		}
		public String setSexo() {
			return sexo;
		}
		public void setSexo(String sexo) {
			this.sexo = sexo;
		}
		public int getIdade() {
			return idade;
		}
		public void setIdade(int idade) {
			this.idade = idade;
		}
		public int getCelular() {
			return celular;
		}
		public void setCelular(int celular) {
			this.celular = celular;
		}
		public String getCpf() {
			return cpf;
		}
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		public String getSituacao() {
			return situacao;
		}
		public void setSituacao(String situacao) {
			this.situacao = situacao;
		}
		
		public void visualizar() {
			System.out.println("*********************************************************");
			System.out.println("Dados do paciente:");
			System.out.println("*********************************************************");
			System.out.println("Nome do paciente: " + this.nome);
			System.out.println("Sobrenome do paciente: " + this.sobrenome);
			System.out.println("Sexo do paciente: "+ this.sexo);
			System.out.println("Idade do paciente: " + this.idade);
			System.out.println("Celular do paciente:" + this.celular);
			System.out.println("CPF do paciente: " + this.cpf);
			System.out.println("Situação do paciente: "+ this.situacao);

	}

}
