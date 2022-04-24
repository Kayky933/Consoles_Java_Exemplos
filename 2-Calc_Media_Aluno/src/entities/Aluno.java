package entities;

public class Aluno {
	public String nome;
	public int idade;
	public double nota1;
	public double nota2;
	public double nota3;
	public double nota4;
	public double nota5;
	public double nota6;

	public double mediaCalc() {
		double media;
		media = (nota1 + nota2 + nota3 + nota4 + nota5 + nota6) / 6;
		return media;
	}
}