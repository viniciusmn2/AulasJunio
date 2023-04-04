import java.util.Scanner;

public class Questao14 {

	    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a idade de João ");
		int joao = sc.nextInt();
		
		System.out.println("Informe a idade de José");
		int jose = sc.nextInt();
		
		System.out.println("Informe a idade de Maria");
		int maria = sc.nextInt();

		if ((joao < jose) && (joao < maria)) {
			System.out.println("Joao é o Caçula");
			
		} else {
			if ((jose < joao) && (jose < maria)) {
				System.out.println("Jose é o Caçula");
			} else {
				System.out.println("Maria é o Caçula");

			}

		}
		}
		
		
				
		
		

	}

}
