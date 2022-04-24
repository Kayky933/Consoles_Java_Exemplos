import java.util.Scanner;

import entities.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Olá, seja bem vindo, qual filme voc� gostaria de assistir ?");
        Scanner scan = new Scanner(System.in);

        Pessoa pessoa = new Pessoa();

        pessoa.assistirFilme(scan.nextLine());
        System.out.println("Em que idioma você prefere a legenda??");
        pessoa.buscarLegendaIdioma(scan.nextLine());
        System.out.println("Em que idioma você gostaria de assistir o filme?");
        pessoa.buscaraAudioIdioma(scan.nextLine());
        System.out.println("Qual a resolução que você gostaria?");
        pessoa.resolucaoFilme(scan.nextLine());

        pessoa.mostrarDados(pessoa);
        scan.close();
    }
}
