package entities;

public class Produto {
	public String nome;
	public double preco;
	public int quantidade;

	public void addProdutoEstoque(int quant) {
		quantidade += quant;
	}

	public void removeProdutoEstoque(int quant) {
		quantidade -= quant;
	}

	public double valorTotalEstoque() {
		return preco * quantidade;
	}

	public String toString() {
		return "\nNome: " + nome + "\nPre�o por unidade: " + preco + "\nQuantidade: " + quantidade
				+ "\nValor do estoque atual: " + valorTotalEstoque()+"\n";
	}

}
