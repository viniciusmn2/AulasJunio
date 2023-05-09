import java.util.Scanner;

public class Informaçoes {

	public static void main(String[] args) {
		
		Informaçoes aluno = new Informaçoes();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o nome do Aluno :");
        aluno.setNome(sc.next());
		
		System.out.println("Informe na idade do Aluno :");
		aluno.setIdade(sc.next());
		
		System.out.println("Informe a Faculdade do Aluno :");
		aluno.setFaculdade(sc.next());
		
		Disciplina disciplina1 = new Disciplina ();
		
		disciplina1.setDisciplina("Banco de dados");
		disciplina1.setNota(8);
		
		Disciplina disciplina2 = new Disciplina ();
		
		disciplina2.setDisciplina("Programaçao");
		disciplina2.setNota(9);
		
		Disciplina disciplina3 = new Disciplina ();
		
		disciplina3.setDisciplina("Compiladores");
		disciplina3.setNota(10);
		
		
         aluno.getDisciplinas().add(disciplina1);
        
        aluno.getDisciplinas().add(disciplina2);
		
		
		System.out.println("Quantas disciplinas irá informar : ");
		int qtdDisciplinas;
		for (int i = 1; i <= qtdDisciplinas; i++)
			
			
			System.out.println("Informe a Disciplina " + i + " : ");
			String disc = sc.next();
			String i;
			System.out.println("Informe a Nota " + i + " : ");
			double nota = sc.nextDouble();
			Disciplina disciplina = new Disciplina ();
			disciplina.setDisciplina(disc);
			disciplina.setNota(nota);
			aluno.getDisciplinas().add(disciplina);
		
		
			System.out.println("Aluno");
		
		
		

		
		
		
        
        
        
        
        
        

	}

	private Object getDisciplinas() {
		// TODO Auto-generated method stub
		return null;
	}

	private void setFaculdade(String next) {
		// TODO Auto-generated method stub
		
	}

	private void setIdade(String next) {
		// TODO Auto-generated method stub
		
	}

	private void setNome(String next) {
		// TODO Auto-generated method stub
		
	}

	
		
	}


