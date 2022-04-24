import java.util.ArrayList;

import entities.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
       Pessoa pessoa1 = new Pessoa("Joaquin", 17);
       Pessoa pessoa2 = new Pessoa("Maria", 18);
       Pessoa pessoa3 = new Pessoa("Claudia", 19);
       Pessoa pessoa4 = new Pessoa("Pedro", 20);
       Pessoa pessoa5 = new Pessoa("josé", 21);
       Pessoa pessoa6 = new Pessoa("Marcos", 22);
       Pessoa pessoa7 = new Pessoa("Joaquina", 23);
       Pessoa pessoa8 = new Pessoa("Antonieta", 24);
       Pessoa pessoa9 = new Pessoa("Rosa", 25);
       Pessoa pessoa10 = new Pessoa("Paula", 26);

       ArrayList<Pessoa> listaPessoas = new ArrayList<Pessoa>();
       listaPessoas.add(pessoa1);
       listaPessoas.add(pessoa2);
       listaPessoas.add(pessoa3);
       listaPessoas.add(pessoa4);
       listaPessoas.add(pessoa5);
       listaPessoas.add(pessoa6);
       listaPessoas.add(pessoa7);
       listaPessoas.add(pessoa8);
       listaPessoas.add(pessoa9);
       listaPessoas.add(pessoa10);

       for (Pessoa pessoas : listaPessoas) {
           System.out.println(pessoas.toString());
           System.out.println("--------------------------------");
       }
       
    }
}
