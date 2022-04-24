import java.util.Scanner;

import entities.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {

        Pessoa pessoa = new Pessoa();

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um nome:");
        pessoa.setNome(scan.nextLine());
        System.out.println("Nome digitado: " + pessoa.getNome());
        System.out.println("Digite a idade:");
        pessoa.setIdade(scan.nextInt());
        System.out.println("Idade digitada: " + pessoa.getIdade());
        System.out.println("Digite uma altura:");
        pessoa.setAltura(scan.nextDouble());
        System.out.println("Altura digitada: " + pessoa.getAltura() + "\n\n\n");
        System.out.println("Cadastro completo: ");
        System.out.println(pessoa);
        scan.close();
    }
}
