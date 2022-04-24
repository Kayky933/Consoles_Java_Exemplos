package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.TrabalhadorNivel;

public class Trabalhador {
	private String nome;
	private TrabalhadorNivel nivel;
	private Double baseSalarial;

	private Departamento departamento;
	private List<ContratoHora> contrato = new ArrayList<ContratoHora>();

	public Trabalhador() {
	}

	public Trabalhador(String nome, TrabalhadorNivel nivel, Double baseSalarial, Departamento departamento) {
		this.nome = nome;
		this.nivel = nivel;
		this.baseSalarial = baseSalarial;
		this.departamento = departamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TrabalhadorNivel getNivel() {
		return nivel;
	}

	public void setNivel(TrabalhadorNivel nivel) {
		this.nivel = nivel;
	}

	public Double getBaseSalarial() {
		return baseSalarial;
	}

	public void setBaseSalarial(Double baseSalarial) {
		this.baseSalarial = baseSalarial;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<ContratoHora> getContrato() {
		return contrato;
	}

	public void addContrato(ContratoHora contrato) {
		this.contrato.add(contrato);
	}

	public void removeContrato(ContratoHora contrato) {
		this.contrato.remove(contrato);
	}

	public double renda(int ano, int mes) {
		double soma = this.baseSalarial;
		Calendar calendario = Calendar.getInstance();
		for (ContratoHora contratoHora : contrato) {
			calendario.setTime(contratoHora.getData());
			int anoContrato = calendario.get(Calendar.YEAR);
			int mesContrato = 1 + calendario.get(Calendar.MONTH);
			if (ano == anoContrato && mes == mesContrato) {
				soma += contratoHora.valorTotal();
			}
		}
		return soma;
	}
	
}
