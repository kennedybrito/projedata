package com.projedata.principal;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Funcionario extends Pessoa {

	public BigDecimal salario;
	public String funcao;
	
	
	Pessoa pessoa = new Pessoa();
	
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
		
	

	
	@Override
	public String toString() {
	   
		return ("Nome: " + this.nome + " Data Nascimento: "  + nascimento.format(formatter)  +
	    		 " Salario: "  + salario + "funcão: " + funcao);
	}
	
	public Funcionario () {
		
	}
	
	public Funcionario ( String nome, LocalDate nascimento, BigDecimal salario, String funcao) {
		this.salario = salario;
		this.funcao = funcao;
		this.nome = nome;
		this.nascimento = nascimento;
			
	}
	
	
	

	 
}
