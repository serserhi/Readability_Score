import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        String[] parts = str.split("");
        String salida = "";

        if (str.length() % 2 == 0) {
            for (int i = 0; i < str.length(); i++) {
                if ((i != str.length() /2 - 1) && (i != str.length() /2)) {
                    salida += parts[i];
                }
            }
        } else {
            for (int i = 0; i < str.length(); i++) {
                if (i != str.length() /2 ) {
                    salida += parts[i];
                }
            }
        }
        System.out.println(salida);
    }
}