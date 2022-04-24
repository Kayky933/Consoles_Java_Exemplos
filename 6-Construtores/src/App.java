import entities.Pessoa;

public class App {
	public static void main(String[] args) throws Exception {
		System.out.println("Hello, World!");
		Pessoa pessoa = new Pessoa();
		System.out.println("Construtor padr�o:");

		System.out.println(pessoa.getNome());
		System.out.println(pessoa.getIdade());
		System.out.println(pessoa.getCpf());
		System.out.println(pessoa.getRg());

		Pessoa pessoa2 = new Pessoa("Maria", 33, "098.765.432-11", "09.876.543-21");
		System.out.println("\nPessoa add valores: ");
		System.out.println(pessoa2.getNome());
		System.out.println(pessoa2.getIdade());
		System.out.println(pessoa2.getCpf());
		System.out.println(pessoa2.getRg());
	}
}
