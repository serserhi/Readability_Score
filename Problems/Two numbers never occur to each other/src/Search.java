import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Search {
    public static void main(String[] args) {
        // put your code here

        String pathToFile = "D:\\dataset_91007.txt";
        File file = new File(pathToFile);
        int numero = 0;
        int maximo = 0;

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                numero = scanner.nextInt();
                if (numero > maximo) {
                    maximo = numero;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("No file found: " + pathToFile);
        }

        System.out.println(maximo);

    }
}