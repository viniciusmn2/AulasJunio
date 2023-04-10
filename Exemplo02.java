import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class Exemplo02 {

	public static void main(String[] args) {
		// se a soma for Maior ou igual a 20 add 10
		// senao subtrai de 5 
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Informe um valor :");
		int n1 = sc.nextInt();
		
		System.out.println("Informe um valor :");
		int n2 = sc.nextInt();
		
		int soma = n1 + n2;
				
		int valor = (soma >= 20) ? soma + 10 : soma - 5;
		System.out.println("O resultado será : " + valor);
		
		
		
		

	}

}
