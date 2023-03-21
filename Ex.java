import java.util.Scanner;

public class Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um numero : ");
		int n1 = sc.nextInt();
		
		
		if (n1 % 3== 0) {
			System.out.println("É multiplo de 3!!!");
		} else {
			System.out.println("Não é multiplo de 3!!!");
		}
		
	
		
		
		sc.close();
	}

}
