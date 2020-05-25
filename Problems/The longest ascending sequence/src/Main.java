import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int longitud = scanner.nextInt();
        int contador = 1;
        int aux = 1;
        int[] array = new int[longitud];
        for (int i = 0; i < longitud; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i-1]) {
                aux++;
            } else {
                if (aux > contador) {
                    contador = aux;
                    aux = 1;
                }
            }
        }
        System.out.println(contador > aux? contador: aux);
    }
}