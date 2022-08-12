package com.generation.paciente.model;

import com.generation.paciente.Paciente;

public class Menu2 {
	public static void main(String[] args) {
		Paciente p1 = new Paciente("Daenerys","Targaryen", "Femenino",23,999999999,101202303,"Dano por arma branca");
		p1.visualizar();
		Paciente p2 = new Paciente();
		p2.visualizar();
		
		p2.setNome("Glenn");
		p2.setSobrenome("Rhee");
		p2.setSexo("Masculino");
		p2.setIdade(24);
		p2.setCelular(988888888);
		p2.setCpf(202101303);
		p2.setSituacao("Golpeado varias vezes na cabeça");
		p2.visualizar();
		
	}

}
