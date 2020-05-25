package readability;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String texto = scanner.nextLine();
        String[] frases = texto.split("[\\.?\\!\\?]");

        int longitudMedia = 0;

        for (String frase : frases) {
            String[] palabras = frase.split(" ");
            longitudMedia += palabras.length;
        }

        longitudMedia = longitudMedia / frases.length;

        if (longitudMedia <= 10) {
            System.out.println("EASY");
        } else {
            System.out.println("HARD");
        }




    }
}
