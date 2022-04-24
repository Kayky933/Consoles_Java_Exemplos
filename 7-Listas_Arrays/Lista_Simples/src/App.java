public class App {
    public static void main(String[] args) throws Exception {
        String[] listaStrings = new String[10];

        listaStrings[0] = "João";
        listaStrings[1] = "Pedro";
        listaStrings[2] = "Maria";
        listaStrings[3] = "Paula";
        listaStrings[4] = "Caio";
        listaStrings[5] = "Antonio";
        listaStrings[6] = "Marcos";
        listaStrings[7] = "Mario";
        listaStrings[8] = "Jose";
        listaStrings[9] = "Jonas";

        System.out.println("-------------------------------------------");
        System.out.println("Lista de Strings:");

        for (String string : listaStrings) {
            System.out.println(string);
        }

        int[] listaInt = new int[10];
        listaInt[0] = 1;
        listaInt[1] = 2;
        listaInt[2] = 3;
        listaInt[3] = 4;
        listaInt[4] = 5;
        listaInt[5] = 6;
        listaInt[6] = 7;
        listaInt[7] = 8;
        listaInt[8] = 9;
        listaInt[9] = 10;

        System.out.println("-------------------------------------------");
        System.out.println("Lista de Inteiros:");

        for (int intNumbers : listaInt) {
            System.out.println(intNumbers);
        }

        double[] listaDouble = new double[10];
        listaDouble[0] = 1.00;
        listaDouble[1] = 2.00;
        listaDouble[2] = 3.00;
        listaDouble[3] = 4.00;
        listaDouble[4] = 5.00;
        listaDouble[5] = 6.00;
        listaDouble[6] = 7.00;
        listaDouble[7] = 8.00;
        listaDouble[8] = 9.00;
        listaDouble[9] = 10.00;

        System.out.println("-------------------------------------------");
        System.out.println("Lista de Doubles:");

        for (double doubleNumbers : listaDouble) {
            System.out.println(doubleNumbers);
        }
        char[] listaChar = new char[10];
        listaChar[0] = 'a';
        listaChar[1] = 'b';
        listaChar[2] = 'c';
        listaChar[3] = 'd';
        listaChar[4] = 'e';
        listaChar[5] = 'f';
        listaChar[6] = 'g';
        listaChar[7] = 'h';
        listaChar[8] = 'i';
        listaChar[9] = 'j';

        System.out.println("-------------------------------------------");
        System.out.println("Lista de Chars:");

        for (char chars : listaChar) {
            System.out.println(chars);
        }

        float[] listaFloat = new float[10];
        listaFloat[0] = 1.00F;
        listaFloat[1] = 2.00F;
        listaFloat[2] = 3.00F;
        listaFloat[3] = 4.00F;
        listaFloat[4] = 5.00F;
        listaFloat[5] = 6.00F;
        listaFloat[6] = 7.00F;
        listaFloat[7] = 8.00F;
        listaFloat[8] = 9.00F;
        listaFloat[9] = 10.00F;

        System.out.println("-------------------------------------------");
        System.out.println("Lista de Floats:");

        for (float floatNumbers : listaFloat) {
            System.out.println(floatNumbers);
        }
    }
}
