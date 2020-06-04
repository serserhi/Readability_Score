import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Population {
    public static void main(String[] args) {
        // put your code here

        String pathToFile = "D:\\dataset_91069.txt";
        File file = new File(pathToFile);
        String cabeceras;
        int año = 0;
        int añoAnterior = 0;
        long poblacion = 0;
        long pobAnterior = 0;
        long incrMayor = 0;
        int añoMayor = 0;

        try (Scanner scanner = new Scanner(file)) {
            cabeceras = scanner.nextLine();

            while (scanner.hasNext()) {
                año = scanner.nextInt();
                cabeceras = scanner.nextLine().replace(",","");
                poblacion = Long.parseLong(cabeceras.trim());
                if (año > 1950) {
                    if (poblacion - pobAnterior > incrMayor) {
                        incrMayor = poblacion - pobAnterior;
                        añoMayor = año;
                    }
                }
                añoAnterior = año;
                pobAnterior = poblacion;
            }
        } catch (FileNotFoundException e) {
            System.out.println("No file found: " + pathToFile);
        }

        System.out.println(añoMayor);

    }
}