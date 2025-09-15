package main.java.fag;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("=== ATIVIDADE JAVA BASICO - 10 QUESTÕES ===\n");

		// Executar todas as questões
		questao1_Scanner(scan);
		questao2_Print();
		questao3_For();
		questao4_If(scan);
		questao5_While(scan);
		questao6_Metodos();
		questao7_ScannerIf(scan);
		questao8_ForPrint();
		questao9_WhileScanner(scan);
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
		String nomeUsuario = "";
		int idadeUsuario;

		System.out.println("Qual o seu nome?\n");
		nomeUsuario = scan.nextLine();

		System.out.println("");

		System.out.println("Qual a sua idade?\n");
		idadeUsuario = scan.nextInt();
		scan.nextLine();

		System.out.println("Olá " + nomeUsuario + "! Você tem " + idadeUsuario + " anos. Seja bem-vindo(a)!");
	}

	// ========================================
	// QUESTÃO 2 - PRINT (Saída de Dados)
	// ========================================
	// TODO: Crie um programa que exiba uma tabela de multiplicação do 5 (de 1 a 10)
	// Formate a saída de forma organizada
	// Exemplo: "5 x 1 = 5", "5 x 2 = 10", etc.
	public static void questao2_Print() {
		int[] resultado = new int[11];

		for (int i = 1; i <= 10; i++) {
			resultado[i] = 5 * i;

			System.out.println("5 x " + i + " = " + resultado[i] + ",\n");
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

		for (int i = 0; i <= 100; i++) {
			resultado = resultado + i;
		}

		System.out.println(resultado);
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

		System.out.println("Qual a sua nota?\n");
		nota = scan.nextFloat();

		if (nota >= 7) {
			System.out.println("Parabéns! Você foi APROVADO!");
		} else if (4 <= nota && nota < 7) {
			System.out.println("Você está em RECUPERAÇÃO. Estude mais!");
		} else {
			System.out.println("Infelizmente você foi REPROVADO. Tente novamente!");
		}
	}

	// ========================================
	// QUESTÃO 5 - WHILE (Laço de Repetição)
	// ========================================
	// TODO: Crie um programa que leia números inteiros até que o usuário digite 0
	// e então exiba a soma de todos os números digitados
	public static void questao5_While(Scanner scan) {
		int numeroDigitado = 0;

		int soma = 0;

		do {
			System.out.println("Digite um numero: ");
			numeroDigitado = scan.nextInt();
			scan.nextLine();

			soma += numeroDigitado;
		} while (numeroDigitado != 0);

		System.out.println(soma);
	}

	// ========================================
	// QUESTÃO 6 - MÉTODOS (Função)
	// ========================================
	// TODO: Crie um método que receba dois números e retorne o maior entre eles
	// Teste o método com diferentes valores
	// Dica: Use o método encontrarMaior() que está declarado abaixo
	public static void questao6_Metodos() {
		int a = 10;
		int b = 5;

		System.out.println("O maior número é: " + encontrarMaior(a, b));
	}

	// ========================================
	// QUESTÃO 7 - SCANNER + IF
	// ========================================
	// TODO: Crie um programa que leia um número e informe se ele é par ou ímpar
	// Use o operador % (módulo) para verificar o resto da divisão por 2
	public static void questao7_ScannerIf(Scanner scan) {
		int numeroInformado = 0;

		System.out.println("Informe um número:\n");
		numeroInformado = scan.nextInt();
		scan.nextLine();

		if (numeroInformado % 2 == 0) {
			System.out.println("O numero é PAR: " + numeroInformado);
		} else {
			System.out.println("O numero é IMPAR: " + numeroInformado);
		}
	}

	// ========================================
	// QUESTÃO 8 - FOR + PRINT
	// ========================================
	// TODO: Crie um programa que exiba todos os números pares de 2 até 20
	// Exiba um número por linha
	public static void questao8_ForPrint() {
		int i = 0;

		for (i = 1; i <= 20; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

	// ========================================
	// QUESTÃO 9 - WHILE + SCANNER
	// ========================================
	// TODO: Crie um programa que leia números até que o usuário digite um número
	// negativo
	// e conte quantos números positivos foram digitados
	public static void questao9_WhileScanner(Scanner scan) {
		int numeroDigitado = 0;

		int contagem = 0;

		do {
			System.out.println("Digite um numero: ");
			numeroDigitado = scan.nextInt();
			scan.nextLine();

			if (numeroDigitado >= 0) {
				contagem += 1;
			}
		} while (numeroDigitado > -1);

		System.out.println(contagem);
	}

	// ========================================
	// QUESTÃO 10 - MÉTODOS + FOR
	// ========================================
	// TODO: Crie um método que receba um número e retorne o fatorial desse número
	// Teste o método com os valores 5 e 7
	// Dica: Use o método calcularFatorial() que está declarado abaixo
	// Fatorial de 5 = 5! = 5 x 4 x 3 x 2 x 1 = 120
	public static void questao10_MetodosFor() {
		int n = 5;

		System.out.println(calcularFatorial(n));
	}

	// ========================================
	// MÉTODO PARA QUESTÃO 6
	// ========================================
	// TODO: Implemente este método para retornar o maior entre dois números
	public static int encontrarMaior(int a, int b) {

		int maior = 0;

		if (a > b) {
			maior = a;
		} else {
			maior = b;
		}
		return maior;
	}

	// ========================================
	// MÉTODO PARA QUESTÃO 10
	// ========================================
	// TODO: Implemente este método para calcular o fatorial de um número
	// Use um laço for para fazer o cálculo
	public static long calcularFatorial(int n) {

		int resultado = 1;

		for (int j = 1; j <= n; j++) {
			resultado *= j;
		}

		return resultado;
	}
}