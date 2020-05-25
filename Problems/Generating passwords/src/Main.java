import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int upper = scanner.nextInt();
        int lower = scanner.nextInt();
        int digits = scanner.nextInt();
        int longitud = scanner.nextInt();
        String password = "";
        int numero;
        int ultimo = 65;
        char letra;

        for (int i = 0; i <= upper - 1; i++) {
            ultimo = (65 + i % 25);
            letra = (char) ultimo;
            password += String.valueOf(letra);
        }
        for (int i = 0; i <= lower - 1 ; i++) {
            numero = (97 + i % 25);
            letra = (char) numero;
            password += String.valueOf(letra);
        }
        for (int i = 0; i <= digits - 1; i++) {
            numero = (48 + i % 10 );
            letra = (char) numero;
            password += String.valueOf(letra);
        }
        for (int i = 0; i <= (longitud - upper - lower - digits) - 1; i++) {
            numero = (ultimo + (i + 1) % 25);
            letra = (char) numero;
            password += String.valueOf(letra);
        }
        System.out.println(password);

    }
}