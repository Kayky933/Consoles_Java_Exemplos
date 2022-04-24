import java.util.Scanner;

import entities.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        Pessoa pessoa = new Pessoa();
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        pessoa.setNome(scan.nextLine());

        System.out.println("Digite dua idade: ");
        pessoa.setIdade(scan.nextInt());

        System.out.println("Digite seu endereco: ");
        scan.nextLine();
        pessoa.setEndereco(scan.nextLine());

        System.out.println("\nCadastro:\n" + pessoa.mostrarCadastro());
        scan.close();
    }
}
