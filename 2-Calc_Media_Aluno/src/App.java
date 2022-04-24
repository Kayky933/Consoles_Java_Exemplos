import java.util.Scanner;

import entities.Aluno;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
		Aluno aluno = new Aluno();

		System.out.println("Digite o nome do aluno: ");
		aluno.nome = scan.nextLine();
		
		System.out.println("Digite a Idade do Aluno: ");
		aluno.idade = scan.nextInt();
		
		System.out.println("Digite a nota 1 do aluno: ");
		aluno.nota1 = scan.nextDouble();
		
		System.out.println("Digite a nota 2 do aluno: ");
		aluno.nota2 = scan.nextDouble();
		
		System.out.println("Digite a nota 3 do aluno: ");
		aluno.nota3 = scan.nextDouble();
		
		System.out.println("Digite a nota 4 do aluno: ");
		aluno.nota4 = scan.nextDouble();
		
		System.out.println("Digite a nota 5 do aluno: ");
		aluno.nota5 = scan.nextDouble();
		
		System.out.println("Digite a nota 6 do aluno: ");
		aluno.nota6 = scan.nextDouble();

		System.out.println("--------------------------------------------");
		System.out.println("Resultado Final:");
		System.out.println("Nome do  Aluno: "+aluno.nome);
		System.out.println("Idade : "+aluno.idade);
		System.out.println("nota 1 : "+aluno.nota1);
		System.out.println("nota 2 : "+aluno.nota2);
		System.out.println("nota 3 : "+aluno.nota3);
		System.out.println("nota 4 : "+aluno.nota4);
		System.out.println("nota 5 : "+aluno.nota5);
		System.out.println("nota 6 : "+aluno.nota6);
		System.out.println("Média Final : "+aluno.mediaCalc());
		System.out.println("--------------------------------------------");
		
		scan.close();
    }
}
