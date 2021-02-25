import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		double primeiroValor, segundoValor;
		double soma, subtracao, multiplicacao, divisao;

		System.out.print("Por favor digite um valor: ");
		primeiroValor = leitor.nextDouble();
		System.out.print("Por favor digite o segundo valor: ");
		segundoValor = leitor.nextDouble();
		leitor.close();

		System.out.println("--------------------------------------");

		soma = primeiroValor + segundoValor;
		System.out.println("A soma entre os dois valores é: " + soma);

		subtracao = primeiroValor - segundoValor;
		System.out.println("A subtracao entre os dois valores é: " + subtracao);

		multiplicacao = primeiroValor * segundoValor;
		System.out.println("A multiplicacao entre os dois valores é: " + multiplicacao);

		divisao = primeiroValor / segundoValor;
		System.out.println("A divisao entre os dois valores é: " + divisao);

	}

}
