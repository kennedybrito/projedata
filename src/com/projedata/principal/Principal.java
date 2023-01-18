package com.projedata.principal;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class Principal {
	public static void main(String[] args) {
		
		
		
		
		
		 
		Funcionario p1 = new Funcionario("Maria", LocalDate.of(2000, 10, 18), new BigDecimal("2009.44") , "Operador");
		Funcionario p2 = new Funcionario("João", LocalDate.of(1990, 05, 12), new BigDecimal("2284.38") , "Operador");
		Funcionario p3 = new Funcionario("Caio", LocalDate.of(1961, 05, 02), new BigDecimal("9836.14") , "Coordenador");
		Funcionario p4 = new Funcionario("Miguel", LocalDate.of(1988, 10, 14), new BigDecimal("19119.88") , "Diretor");
		Funcionario p5 = new Funcionario("Alice", LocalDate.of(1995, 01, 05), new BigDecimal("2234.68") , "Recepcionista");
		Funcionario p6 = new Funcionario("Heitor", LocalDate.of(1999, 11, 19), new BigDecimal("1582.72") , "Operador");
		Funcionario p7 = new Funcionario("Arthur", LocalDate.of(1993, 03, 31), new BigDecimal("4071.84") , "Contador");
		Funcionario p8 = new Funcionario("Laura", LocalDate.of(1994, 07, 8), new BigDecimal("3017.45") , "Gerente");
		Funcionario p9 = new Funcionario("Heloísa", LocalDate.of(2003, 05, 24), new BigDecimal("1606.85") , "Eletricista");
		Funcionario p10 = new Funcionario("Helena", LocalDate.of(1996, 9, 02), new BigDecimal("2799.93") , "Gerente");
		
		List<Funcionario> funcionario = new ArrayList<>();
		funcionario.add(p1);
		funcionario.add(p2);
		funcionario.add(p3);
		funcionario.add(p4);
		funcionario.add(p5);
		funcionario.add(p6);
		funcionario.add(p7);
		funcionario.add(p8);
		funcionario.add(p9);
		funcionario.add(p10);
				
		System.out.println("*** TABELA DE FUNCIONARIOS ***");
		for (int i = 0; i < funcionario.size(); i++) {
			System.out.println(funcionario.get(i));

		}
		//3.2 – Remover o funcionário “João” da lista.
		System.out.println("Removendo o funcionário João");
		funcionario.remove(p2);
		//3.3 – Imprimir todos os funcionários com todas suas informações
		System.out.println("*** TABELA DE FUNCIONARIOS ATUALIZADA ***");
		for (int i = 0; i < funcionario.size(); i++) {
			System.out.println(funcionario.get(i));

		}
		
		//3.4 – Os funcionários receberam 10% de aumento de salário, atualizar a lista de funcionários com novo valor.
		BigDecimal b2 = new BigDecimal("0.10"); 
		
		 BigDecimal total = p1.salario.add(p1.salario.multiply(b2));p1.salario = total;
		 BigDecimal total2 = p2.salario.add(p2.salario.multiply(b2)); p2.salario = total2;
		 BigDecimal total3 = p3.salario.add(p3.salario.multiply(b2)); p3.salario = total3;
		 BigDecimal total4 = p4.salario.add(p4.salario.multiply(b2)); p4.salario = total4;
		 BigDecimal total5 = p5.salario.add(p5.salario.multiply(b2)); p5.salario = total5;
		 BigDecimal total6 = p6.salario.add(p6.salario.multiply(b2)); p6.salario = total6;
		 BigDecimal total7 = p7.salario.add(p7.salario.multiply(b2)); p7.salario = total7;
		 BigDecimal total8 = p8.salario.add(p8.salario.multiply(b2)); p8.salario = total8;
		 BigDecimal total9 = p9.salario.add(p9.salario.multiply(b2)); p9.salario = total9;
		 BigDecimal total10 = p10.salario.add(p10.salario.multiply(b2)); p10.salario = total10;

		
		
		// 3.5 – Agrupar os funcionários por função em um MAP, sendo a chave a “função” e o valor a “lista de funcionários”.

		Map<String, String> funcionarios = new HashMap<>();
		
		funcionarios.put(p1.nome, p1.funcao);
		funcionarios.put(p2.nome, p2.funcao);
		funcionarios.put(p3.nome, p3.funcao);
		funcionarios.put(p4.nome, p4.funcao);
		funcionarios.put(p5.nome, p5.funcao);
		funcionarios.put(p6.nome, p6.funcao);
		funcionarios.put(p7.nome, p7.funcao);
		funcionarios.put(p8.nome, p8.funcao);
		funcionarios.put(p9.nome, p9.funcao);
		funcionarios.put(p10.nome, p10.funcao);
		
		//3.6 – Imprimir os funcionários, agrupados por função.
		System.out.println();
		System.out.println("***LISTA DE FUNCIONARIOS COM MAP ***");
		System.out.println(funcionarios.entrySet());
		
		

		//3.11 – Imprimir o total dos salários dos funcionários.	
		
		BigDecimal totalSalarios = p1.salario.add(p2.salario).add(p3.salario).add(p4.salario).add(p5.salario).add(p6.salario).add(p7.salario).add(p8.salario).add(p9.salario).add(p10.salario);
		System.out.println(totalSalarios);
	
		
		
	}
	
	

}
