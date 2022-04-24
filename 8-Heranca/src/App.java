import java.util.Scanner;

import entities.Aluno;

public class App {
    public static void main(String[] args) throws Exception {
        Aluno aluno = new Aluno();
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o nome do aluno: ");
		aluno.setNome(scan.nextLine());
		
		System.out.println("Digite a Idade do Aluno: ");
		aluno.setIdade(scan.nextInt());
		
		System.out.println("Digite a nota 1 do aluno: ");
		aluno.setNota1(scan.nextDouble());
		
		System.out.println("Digite a nota 2 do aluno: ");
        aluno.setNota2(scan.nextDouble());
		
		System.out.println("Digite a nota 3 do aluno: ");
        aluno.setNota3(scan.nextDouble());
		
		System.out.println("Digite a nota 4 do aluno: ");
        aluno.setNota4(scan.nextDouble());
		
		System.out.println("Digite a nota 5 do aluno: ");
        aluno.setNota5(scan.nextDouble());
		
		System.out.println("Digite a nota 6 do aluno: ");
        aluno.setNota6(scan.nextDouble());

		System.out.println("--------------------------------------------");
		System.out.println("Resultado Final:");
		System.out.println("Nome do  Aluno: "+aluno.getNome());
		System.out.println("Idade : "+aluno.getIdade());
		System.out.println("nota 1 : "+aluno.getNota1());
		System.out.println("nota 2 : "+aluno.getNota2());
		System.out.println("nota 3 : "+aluno.getNota3());
		System.out.println("nota 4 : "+aluno.getNota4());
		System.out.println("nota 5 : "+aluno.getNota5());
		System.out.println("nota 6 : "+aluno.getNota6());
		System.out.println("Media Final : "+aluno.calcMedia());
		System.out.println("--------------------------------------------");

        scan.close();

    }
}
