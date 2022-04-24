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

        Pessoa[] listaPessoas = new Pessoa[10];
        listaPessoas[0] = pessoa1;
        listaPessoas[1] = pessoa2;
        listaPessoas[2] = pessoa3;
        listaPessoas[3] = pessoa4;
        listaPessoas[4] = pessoa5;
        listaPessoas[5] = pessoa6;
        listaPessoas[6] = pessoa7;
        listaPessoas[7] = pessoa8;
        listaPessoas[8] = pessoa9;
        listaPessoas[9] = pessoa10;

        for (Pessoa pessoas : listaPessoas) {
            System.out.println(pessoas.toString());
            System.out.println("---------------------------------");
        }
    }
}
