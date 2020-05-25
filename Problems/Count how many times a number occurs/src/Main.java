
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int longitud = scanner.nextInt();
        int[] array = new int[longitud];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int number = scanner.nextInt();
        int contador = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                contador++;
            }
        }
        System.out.println(contador);
    }
}