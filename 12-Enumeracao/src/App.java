import java.util.Date;

import entities.Pedido;
import entities.enums.StatusPedido;

public class App {
    public static void main(String[] args) throws Exception {
        Pedido novoPedido = new Pedido(1, new Date(), StatusPedido.PAGAMENTO_PENDENTE);
        System.out.println(novoPedido);

        // Transformando string em enum
        StatusPedido status1 = StatusPedido.ENTREGUE;
        StatusPedido status2 = StatusPedido.ENVIADO;
        StatusPedido status3 = StatusPedido.PAGAMENTO_PENDENTE;
        StatusPedido status4 = StatusPedido.PROCESSANDO;
        
        System.out.println("--------------------------");
        System.out.println("Status Puros: ");
        System.out.println("--------------------------");
        System.out.println(status1 + "\n" + status2 + "\n" + status3 + "\n" + status4);
        System.out.println("--------------------------");

        StatusPedido statusString1 = StatusPedido.valueOf("ENTREGUE");
        StatusPedido statusString2 = StatusPedido.valueOf("ENVIADO");
        StatusPedido statusString3 = StatusPedido.valueOf("PAGAMENTO_PENDENTE");
        StatusPedido statusString4 = StatusPedido.valueOf("PROCESSANDO");

        System.out.println("Status String: ");
        System.out.println("--------------------------");
        System.out.println(statusString1 + "\n" + statusString2 + "\n" + statusString3 + "\n" + statusString4);
        System.out.println("--------------------------");

    }
}
