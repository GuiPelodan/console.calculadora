package br.com.pelodan.console.calculadora;

import java.util.Scanner;

public class Inicio {
	static Calculadora calculadora = new Calculadora();
	static Scanner scanner = new Scanner(System.in);
	static Double valor = 0.0;
public static void main (String[] args) {
	iniciar();
	}
	public static void iniciar() {
		valor = 0.0;
		System.out.println("Digite o valor inicial:");
		valor = scanner.nextDouble();
		calculadora.setValor(valor);
		if(calculadora.getValor() == 0.0) {
			iniciar();
		} else {
		continuar();
		}
	}
	public static void continuar() {
		
		System.out.println("Qual operação deseja realizar? (Digite +, -, * ou /)");
		calculadora.setOperacao(scanner.next());
		System.out.println("Qual o segundo valor?");
		calculadora.setSegundoValor(scanner.nextDouble());
		System.out.println("Resultado: " + calculadora.resultado());
		Double resultado = calculadora.resultado();
		System.out.println("Deseja continuar? s ou n");
		String continuar = scanner.next();
		
		if (continuar.equals("s")) {
			calculadora.setValor(resultado);
			continuar();
		} else {
			iniciar();
		}
	}
}
