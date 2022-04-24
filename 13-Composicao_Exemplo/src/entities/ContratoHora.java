package entities;

import java.util.Date;

public class ContratoHora {
    private Date data;
    private Double valorPorHora;
    private Integer horaQuantidade;

    public ContratoHora() {

    }

    public ContratoHora(Date data, Double valorPorHora, Integer horaQuantidade) {
        this.data = data;
        this.valorPorHora = valorPorHora;
        this.horaQuantidade = horaQuantidade;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(Double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    public Integer getHoraQuantidade() {
        return horaQuantidade;
    }

    public void setHoraQuantidade(Integer horaQuantidade) {
        this.horaQuantidade = horaQuantidade;
    }

    public double valorTotal() {
        return this.valorPorHora * this.horaQuantidade;
    }

}
