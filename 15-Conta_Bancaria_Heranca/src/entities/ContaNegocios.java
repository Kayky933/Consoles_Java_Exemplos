package entities;

public class ContaNegocios extends Conta {
    private Double limiteImprestimo;

    public ContaNegocios(Double limiteImprestimo) {
        this.limiteImprestimo = limiteImprestimo;
    }

    public ContaNegocios() {
    }

    public ContaNegocios(Integer numero, String titular, Double saldo, Double limiteImprestimo) {
        super(numero, titular, saldo);
        this.limiteImprestimo = limiteImprestimo;
    }

    public Double getlimiteImprestimo() {
        return limiteImprestimo;
    }

    public void setlimiteImprestimo(Double limiteImprestimo) {
        this.limiteImprestimo = limiteImprestimo;
    }

    public String imprestimo(Double valor) {
        if (valor <= this.limiteImprestimo) {
            saldo += valor - 10.0;
            return "Imprestimo efetuado com sucesso!";
        } else {
            return "Não foi possível efetuar o imprestimo, seu limite é R$" + this.limiteImprestimo;
        }
    }

    @Override 
    public String sacar(Double valor) {
        super.sacar(valor);
        saldo -=2.0;
        if(saldo<0){
            return "não foi possível efetuar o saque";
        }else{
            return "Saque efetuado com sucesso";
        }
    }

}
