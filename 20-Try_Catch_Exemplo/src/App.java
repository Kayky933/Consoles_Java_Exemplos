import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter names with spaces:");
        String[] vect = scan.nextLine().split(" ");

        System.out.println("Enter array position(type int):");
        try {

            int position = scan.nextInt();
            System.out.println(vect[position]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("invalid position!");
            e.printStackTrace();
        } catch (InputMismatchException e) {
            System.out.println("Input error!");
            e.printStackTrace();
        } finally {
            scan.close();
            System.out.println("End of program");
        }
    }
}
