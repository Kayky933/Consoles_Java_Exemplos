
import java.io.IOException;
import java.util.Scanner;

import entities.Produto;

public class App {

	public static void main(String[] args) throws IOException{
		
		Scanner scan = new Scanner(System.in);
		Produto produto = new Produto();
		
		System.out.println("Digite o Nome do produto: ");
		produto.nome = scan.nextLine();

		System.out.println("Digite a Quantidade do produto: ");
		produto.quantidade = scan.nextInt();

		System.out.println("Digite o Preço do produto");
		produto.preco = scan.nextDouble();
		System.out.println(produto);

		System.out.println("Adicione uma quantidade ao produto:");
		produto.addProdutoEstoque(scan.nextInt());
		System.out.println(produto);
		
		System.out.println("Remova uma quantidade do estoque:");
		produto.removeProdutoEstoque(scan.nextInt());
		System.out.println(produto);
		scan.close();

	}

}
