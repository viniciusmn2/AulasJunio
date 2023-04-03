import java.util.Scanner;

public class Questao03 {

	public Questao03() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um valor:");
		int valor1 = sc.nextInt();
		
		System.out.println("Informe um valor:");
		int valor2 = sc.nextInt();
		
		int soma = valor1 + valor2;
		
		if (soma >= 20) {
			soma = soma + 8;
			System.out.println("Resultado : " + soma);
		} else {
			soma = soma - 5;
			System.out.println("Resultado : " + soma);

		}
		
	

	}

}
