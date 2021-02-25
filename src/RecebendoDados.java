import java.util.Scanner;

public class RecebendoDados {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		String nomeUsuario;
		System.out.println("por favor escreva seu nome: ");
		nomeUsuario = leitor.next();
		System.out.println("Obrigado por utilizar o meu programa, " + nomeUsuario);
		
		leitor.close();
	}

}
