package main.java.fag;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("=== ATIVIDADE JAVA BASICO - 10 QUESTÕES ===\n");
		
		// Executar todas as questões
		// questao1_Scanner(scan);
		// questao2_Print();
		// questao3_For();
		// questao4_If(scan);
		// questao5_While(scan);
		// questao6_Metodos();
		// questao7_ScannerIf(scan);
		// questao8_ForPrint();
		// questao9_WhileScanner(scan);
		questao10_MetodosFor();
		
		scan.close();
	}
	
	// ========================================
	// QUESTÃO 1 - SCANNER (Entrada de Dados)
	// ========================================
	// TODO: Crie um programa que leia o nome e a idade de uma pessoa
	// e exiba uma mensagem de boas-vindas personalizada
	// Exemplo: "Olá João! Você tem 20 anos. Seja bem-vindo(a)!"
	public static void questao1_Scanner(Scanner scan) {
		int idade;
		String nome;

		System.out.println("Informe o seu nome");
		nome = scan.nextLine();

		System.out.println("Informe sua idade");
		idade = scan.nextInt();
		scan.nextLine();

		System.out.println("Olá " + nome + "! Você tem " + idade + " anos. Seja bem-vindo(a)!");
	}
	
	// ========================================
	// QUESTÃO 2 - PRINT (Saída de Dados)
	// ========================================
	// TODO: Crie um programa que exiba uma tabela de multiplicação do 5 (de 1 a 10)
	// Formate a saída de forma organizada
	// Exemplo: "5 x 1 = 5", "5 x 2 = 10", etc.
	public static void questao2_Print() {
		int numeroMultiplicado = 5;

		for(int i = 1; i <= 10; i++) {
			System.out.println(numeroMultiplicado + " x " + i + " = " + numeroMultiplicado * i + ", ");
		}
	}
	
	// ========================================
	// QUESTÃO 3 - FOR (Laço de Repetição)
	// ========================================
	// TODO: Crie um programa que calcule e exiba a soma dos números de 1 até 100
	// Use um laço for para fazer o cálculo
	// Resultado esperado: 5050
	public static void questao3_For() {
		int resultado = 0;

		for(int i = 1; i <= 100; i++) {
			resultado += i;
		}

		System.out.println("Resultado esperado: " + resultado);
	}
	
	// ========================================
	// QUESTÃO 4 - IF (Estrutura Condicional)
	// ========================================
	// TODO: Crie um programa que leia uma nota e informe:
	// - Aprovado (nota >= 7): "Parabéns! Você foi APROVADO!"
	// - Recuperação (4 <= nota < 7): "Você está em RECUPERAÇÃO. Estude mais!"
	// - Reprovado (nota < 4): "Infelizmente você foi REPROVADO. Tente novamente!"
	public static void questao4_If(Scanner scan) {
		float nota = 0;

		System.out.println("Informe a sua nota: ");
		nota = scan.nextFloat();

		if(nota >= 7) {
			System.out.println("Parabéns! Você foi APROVADO!");
		} else if(nota >= 4 && nota < 7) {
			System.out.println("Você está em RECUPERAÇÃO. Estude mais!");
		} else if(nota < 4) {
			System.out.println("Infelizmente você foi REPROVADO. Tente novamente!");
		}
	}
	
	// ========================================
	// QUESTÃO 5 - WHILE (Laço de Repetição)
	// ========================================
	// TODO: Crie um programa que leia números inteiros até que o usuário digite 0
	// e então exiba a soma de todos os números digitados
	public static void questao5_While(Scanner scan) {
		int somaNumerosDigitados = 0, numeroSerDigitado = 0;
		
		do {
			System.out.println("Informe um número para a soma: ");
			numeroSerDigitado = scan.nextInt();
			somaNumerosDigitados += numeroSerDigitado;
		} while(numeroSerDigitado != 0);

		System.out.println(somaNumerosDigitados);
	}
	
	// ========================================
	// QUESTÃO 6 - MÉTODOS (Função)
	// ========================================
	// TODO: Crie um método que receba dois números e retorne o maior entre eles
	// Teste o método com diferentes valores
	// Dica: Use o método encontrarMaior() que está declarado abaixo
	public static void questao6_Metodos() {
		System.out.println("Maior número: " + encontrarMaior(12, 89));
	}
	
	// ========================================
	// QUESTÃO 7 - SCANNER + IF
	// ========================================
	// TODO: Crie um programa que leia um número e informe se ele é par ou ímpar
	// Use o operador % (módulo) para verificar o resto da divisão por 2
	public static void questao7_ScannerIf(Scanner scan) {
		int numero;

		System.out.println("Informe um número para ver se ele é ímpar ou par: ");
		numero = scan.nextInt();

		if(numero % 2 == 0) {
			System.out.println("Esse número é PAR!");
		} else {
			System.out.println("Esse número é ÍMPAR!");
		}
	}
	
	// ========================================
	// QUESTÃO 8 - FOR + PRINT
	// ========================================
	// TODO: Crie um programa que exiba todos os números pares de 2 até 20
	// Exiba um número por linha
	public static void questao8_ForPrint() {
		for(int i = 2; i <= 20; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
	
	// ========================================
	// QUESTÃO 9 - WHILE + SCANNER
	// ========================================
	// TODO: Crie um programa que leia números até que o usuário digite um número negativo
	// e conte quantos números positivos foram digitados
	public static void questao9_WhileScanner(Scanner scan) {
		int contador = 0, numeroAtual = 0;

		while(numeroAtual >= 0) {
			System.out.println("Informe um número");
			numeroAtual = scan.nextInt();

			if(numeroAtual >= 0) {
				contador++;
			}
		}

		System.out.println("Foi informado " + contador + " números positivos!");
	}
	
	// ========================================
	// QUESTÃO 10 - MÉTODOS + FOR
	// ========================================
	// TODO: Crie um método que receba um número e retorne o fatorial desse número
	// Teste o método com os valores 5 e 7
	// Dica: Use o método calcularFatorial() que está declarado abaixo
	// Fatorial de 5 = 5! = 5 x 4 x 3 x 2 x 1 = 120
	public static void questao10_MetodosFor() {
		System.out.println(calcularFatorial(5));
		System.out.println(calcularFatorial(7));
	}
	
	// ========================================
	// MÉTODO PARA QUESTÃO 6
	// ========================================
	// TODO: Implemente este método para retornar o maior entre dois números
	public static int encontrarMaior(int a, int b) {
		if(a > b) {
			return a;
		} else {
			return b;
		}
	}
	
	// ========================================
	// MÉTODO PARA QUESTÃO 10
	// ========================================
	// TODO: Implemente este método para calcular o fatorial de um número
	// Use um laço for para fazer o cálculo
	public static long calcularFatorial(int n) {
		int resultadoFatorial = 1;

		for(int i = 1; i < n; i++) {
			resultadoFatorial *= (i + 1);
		}

		return resultadoFatorial;
	}
}