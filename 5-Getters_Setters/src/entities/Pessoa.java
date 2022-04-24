package entities;

public class Pessoa {
    private String nome;
    private int idade;
    private double altura;

    public String toString() {
        return "Nome: " + nome + "\nIdade: " + idade + "\nAltura: " + altura;
    }

    public void menu() {
        System.out.println(
                "1-Cadastrar uma pessoa" +
                        "\n2-Pegar cadastro feito" +
                        "\n3-Saber o nome" +
                        " \n4-Saber a idade" +
                        "\n5-Saber a altura");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

}
