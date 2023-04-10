import java.util.Scanner;

public class Escolha {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Informe um valor :");
		String sexo = sc.next().toUpperCase();
		
		switch (sexo) {
		case "M"
		System.out.println("Masculino");
		break;
		case "F" :
		System.out.println("Feminino");	
		break;
		}
		
		
		

	}

}
