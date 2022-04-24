package entities;

public class ContaPoupanca extends Conta {
    private Double taxaJuros;

    public ContaPoupanca() {
        super();
    }

    public ContaPoupanca(Integer numero, String titular, Double saldo, Double taxaJuros) {
        super(numero, titular, saldo);
        this.taxaJuros = taxaJuros;
    }

    public Double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(Double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    public void updateSaldo() {
        saldo += saldo * taxaJuros;
    }
    @Override 
    public String sacar(Double valor) {
        if(this.saldo-valor<0){
            return "Não foi possível sacar R$"+valor+" Sua conta atualmente tem R$"+this.saldo;
        }else{
        this.saldo -= valor;
        return "Saque efetuado com sucesso!";
        }
    }
}
