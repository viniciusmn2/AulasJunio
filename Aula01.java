import java.util.Scanner;

public class Aula01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe um valor:");				
		int idade = sc.nextInt();
		
				
		if(idade >= 18) {
			System.out.println("� maior de idade:");			
		}else {
			System.out.println("N�o � maior de idade!!!:");
		}

	sc.close();
	}

}
