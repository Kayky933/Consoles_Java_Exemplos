import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite algum número: ");
        int row = scan.nextInt();
        int[][] matriz = new int[row][row];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                // i = linha, j = coluna
                System.out.println("Adicione um número para a matriz: ");
                matriz[i][j] = scan.nextInt();
            }
        }
        System.out.println("Diagonal Principal: ");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + " ");
        }

        System.out.println("Números negativos: ");

        ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < 0) {
                    listaNumeros.add(matriz[i][j]);
                }
            }
        }

        System.out.println("Números negativos(Quantidade):\n " + listaNumeros.size());
        System.out.println("Números negativos(Números): ");
        for (int numeros : listaNumeros) {
            System.out.println(numeros);
        }
        scan.close();
    }
}
