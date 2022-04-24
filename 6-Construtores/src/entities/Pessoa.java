package entities;

public class Pessoa {
    private String nome;
    private int idade;
    private String cpf;
    private String rg;

    public Pessoa() {
        this.nome = "João";
        this.idade = 13;
        this.cpf = "123.456.789.01";
        this.rg = "12.345.678-90";
    }

    public Pessoa(String nome, int idade, String cpf, String rg) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.rg = rg;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
}
