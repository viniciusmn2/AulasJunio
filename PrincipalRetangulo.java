import java.util.Scanner;

public class PrincipalRetangulo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		
		Retangulo r = new Retangulo();
		System.out.println("Informe a Largura ");
		r.width = entrada.nextDouble();
		
		
		System.out.println("Informe a  Altura ");
		r.heigth = entrada.nextDouble();
		
		double valorArea = r.area();
		System.out.println("O valor da Area : " + valorArea);
		
		System.out.println("O valor do Perimetro :" + r.perimetro());
		
		System.out.println("O valor da diagonal : " + 
		                   String.format("%.2f", r.diagonal()));

	}

}
