import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] parts = str.split("-");
        String salida = "";
        salida = parts[1] + "/" + parts[2] + "/" + parts[0];
        System.out.println(salida);

    }
}