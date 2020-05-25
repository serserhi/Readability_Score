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
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        boolean juntos = true;

        for (int i = 1; i < array.length; i++) {
            if (((array[i] == n) && (array[i-1] == m)) ||
            ((array[i] == m) && (array[i-1] == n))) {
                juntos = false;
                break;
            }
        }
        System.out.println(juntos);
    }
}