import java.util.Scanner;

public class Questao14 {

	    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a idade de Jo�o ");
		int joao = sc.nextInt();
		
		System.out.println("Informe a idade de Jos�");
		int jose = sc.nextInt();
		
		System.out.println("Informe a idade de Maria");
		int maria = sc.nextInt();

		if ((joao < jose) && (joao < maria)) {
			System.out.println("Joao � o Ca�ula");
			
		} else {
			if ((jose < joao) && (jose < maria)) {
				System.out.println("Jose � o Ca�ula");
			} else {
				System.out.println("Maria � o Ca�ula");

			}

		}
		}
		
		
				
		
		

	}

}
