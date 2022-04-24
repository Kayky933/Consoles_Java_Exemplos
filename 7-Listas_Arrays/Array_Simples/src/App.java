import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<String> arrayStrings = new ArrayList<String>();

        arrayStrings.add("João");
        arrayStrings.add("Pedro");
        arrayStrings.add("Marcio");
        arrayStrings.add("Caio");
        arrayStrings.add("Maria");
        arrayStrings.add("Rosa");
        arrayStrings.add("Jessica");
        arrayStrings.add("Peda");
        arrayStrings.add("Mirian");
        arrayStrings.add("Joaquina");
        arrayStrings.add("Marcia");

        System.out.println("-------------------------------------------");
        System.out.println("Array de Strings:");

        for (String string : arrayStrings) {
            System.out.println(string);
        }

        ArrayList<Integer> arrayInt = new ArrayList<Integer>();
        arrayInt.add(1);
        arrayInt.add(2);
        arrayInt.add(3);
        arrayInt.add(4);
        arrayInt.add(5);
        arrayInt.add(6);
        arrayInt.add(7);
        arrayInt.add(8);
        arrayInt.add(9);
        arrayInt.add(10);

        System.out.println("-------------------------------------------");
        System.out.println("Array de Inteiros:");

        for (int intNumber : arrayInt) {
            System.out.println(intNumber);
        }

        ArrayList<Double> arrayDouble = new ArrayList<Double>();
        arrayDouble.add(1.100);
        arrayDouble.add(2.200);
        arrayDouble.add(3.300);
        arrayDouble.add(4.400);
        arrayDouble.add(5.500);
        arrayDouble.add(6.600);
        arrayDouble.add(7.700);
        arrayDouble.add(8.800);
        arrayDouble.add(9.900);
        arrayDouble.add(10.000);

        System.out.println("-------------------------------------------");
        System.out.println("Array de Doubles:");

        for (double doubleNumber : arrayDouble) {
            System.out.println(doubleNumber);
        }
        ArrayList<Character> arrayChar = new ArrayList<Character>();
        arrayChar.add('a');
        arrayChar.add('b');
        arrayChar.add('c');
        arrayChar.add('d');
        arrayChar.add('e');
        arrayChar.add('f');
        arrayChar.add('g');
        arrayChar.add('h');
        arrayChar.add('i');
        arrayChar.add('j');

        System.out.println("-------------------------------------------");
        System.out.println("Array de Chars:");

        for (char charCharacter : arrayChar) {
            System.out.println(charCharacter);
        }
        ArrayList<Float> arrayFloat = new ArrayList<Float>();
        arrayFloat.add(1F);
        arrayFloat.add(2F);
        arrayFloat.add(3F);
        arrayFloat.add(4F);
        arrayFloat.add(5F);
        arrayFloat.add(6F);
        arrayFloat.add(7F);
        arrayFloat.add(8F);
        arrayFloat.add(9F);
        arrayFloat.add(10F);

        System.out.println("-------------------------------------------");
        System.out.println("Array de Floats:");

        for (float floatNumber : arrayFloat) {
            System.out.println(floatNumber);
        }
    }
}
