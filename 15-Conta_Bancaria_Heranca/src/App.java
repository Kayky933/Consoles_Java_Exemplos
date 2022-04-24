import entities.Conta;
import entities.ContaNegocios;
import entities.ContaPoupanca;

public class App {
    public static void main(String[] args) throws Exception {

        ContaNegocios bacc = new ContaNegocios(1002, "Maria", 0.0, 500.0);

        // UPCASTING

        Conta acc1 = bacc;
        System.out.println(acc1);
        Conta acc2 = new ContaNegocios(1003, "Bob", 0.0, 200.0);
        Conta acc3 = new ContaPoupanca(1004, "Anna", 0.0, 0.01);

        // DOWNCASTING

        ContaNegocios acc4 = (ContaNegocios) acc2;

        System.out.println("---------------------------");
        System.out.println("Saldo antes do imprestimo: " + acc4.getSaldo());
        System.out.println(acc4.imprestimo(100.0));
        System.out.println("Saldo após imprestimo: " + acc4.getSaldo());
        System.out.println("---------------------------");

        // ContaNegocios acc5 = (ContaNegocios)acc3;
        if (acc3 instanceof ContaNegocios) {
            ContaNegocios acc5 = (ContaNegocios) acc3;

            System.out.println(acc5.imprestimo(200.0));
        } else {
            System.out.println(
                    "Não foi possível efetuar o imprestimo poi sos tipos de objetos instanciados são diferentes");
        }

        if (acc3 instanceof ContaPoupanca) {
            ContaPoupanca acc5 = (ContaPoupanca) acc3;
            acc5.updateSaldo();
            System.out.println("Update efetuado com sucesso!");
        } else {
            System.out
                    .println("Não foi possível efetuar o update pois os tipos de objetos instanciados são diferentes");
        }

        System.out.println("--------------------------");
        Conta acc6 = new Conta(1001, "Alex", 1000.0);
		System.out.println(acc6.sacar(200.0));
		System.out.println(acc6.getSaldo());
		
		Conta acc7 = new ContaPoupanca(1002, "Maria", 1000.0, 0.01);
		System.out.println(acc7.sacar(200.0));
		System.out.println(acc7.getSaldo());
		
		Conta acc8 = new ContaNegocios(1003, "Bob", 1000.0, 500.0);
		System.out.println(acc8.sacar(200.0));
		System.out.println(acc8.getSaldo());
    }
}
