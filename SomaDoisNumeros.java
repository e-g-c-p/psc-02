import java.util.Scanner;
public class SomaDoisNumeros {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		double primeiroOperando;
		double segundoOperando;
		double resultado;
		
		System.out.println("Digite o primeiro operando:");
		primeiroOperando = leitor.nextDouble();
		System.out.println("Digite o segundo operando:");
		segundoOperando = leitor.nextDouble();
		
		resultado = primeiroOperando + segundoOperando;

		System.out.print("Resultado: ");
		System.out.println(resultado);
	}
}
