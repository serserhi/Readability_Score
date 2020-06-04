package readability;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static int cuentaSilabas (String palabra) {
        int longitud = palabra.length();
        int contador = 0;
        for (int i = 0; i < longitud - 1 ; i++) {
            if ((Character.toString(palabra.charAt(i)).matches("[aeiouyAEIOUY]")) &&
                    (Character.toString(palabra.charAt(i + 1)).matches("[^aeiouyAEIOUY]"))) {
                contador++;
            }
        }
        if (Character.toString(palabra.charAt(longitud - 1)).matches("[aiouyAIOUY]")) {
            contador++;
        }

        if (contador == 0) { contador = 1;}
        return contador;
    }

    public static String edad (double score) {
        String edad = "";
        switch ((int) Math.round(score)) {
            case (1):
                edad =  "6";
                break;
            case (2):
                edad = "7";
                break;
            case (3):
                edad = "9";
                break;
            case (4):
                edad = "10";
                break;
            case (5):
                edad = "11";
                break;
            case (6):
                edad = "12";
                break;
            case (7):
                edad = "13";
                break;
            case (8):
                edad = "14";
                break;
            case (9):
                edad = "15";
                break;
            case (10):
                edad = "16";
                break;
            case (11):
                edad = "17";
                break;
            case (12):
                edad = "18";
                break;
            case (13):
                edad = "24";
                break;
            case (14):
                edad = "24";
                break;
        }
        return edad;
    }

    public static void main(String[] args) throws IOException {
        for (String arg : args) {
            Scanner scanner = new Scanner("");
            try {
                scanner = new Scanner(new File(arg));
            } catch (Exception e) {
                System.out.println("Invalid file path");
            }

            ArrayList<String> words = new ArrayList<>();
            while (scanner.hasNext()) words.add(scanner.next());
            int totalCharacters = 0;
            int totalSentences = 1;
            int totalSilabas = 0;
            int totalPolisilabas = 0;
            String score = "";
            for (int i = 0; i < words.size(); i++) {
                totalCharacters += words.get(i).length();
                totalSilabas += cuentaSilabas(words.get(i));
                if (cuentaSilabas(words.get(i)) > 2) {totalPolisilabas++;}
                if (words.get(i).matches(".*[.;!?]") && i != words.size() - 1) totalSentences++;
            }
            scanner.close();


            System.out.println("The text is:");
            System.out.println(new String(Files.readAllBytes(Paths.get(arg))));
            System.out.println();
            System.out.println("Words: " + words.size());
            System.out.println("Sentences: " + totalSentences);
            System.out.println("Characters: " + totalCharacters);
            System.out.println("Syllables: " + totalSilabas);
            System.out.println("Polysyllables: " + totalPolisilabas);


            double ARI = 4.71 * (double) totalCharacters / words.size() + 0.5 * (double) words.size() / totalSentences - 21.43;
            double FK = 0.39 * (double) words.size() / totalSentences + 11.8 * (double) totalSilabas / words.size() - 15.59;
            double SMOG = 1.043 * Math.sqrt(totalPolisilabas * (30 / totalSentences)) + 3.1291;
            double CL = 0.0588 * (double) totalCharacters / words.size()  * 100 - 0.296 * (double) totalSentences / words.size() * 100 - 15.8;

            System.out.println("Enter the score you want to calculate (ARI, FK, SMOG, CL, all):");
            Scanner scanner2 = new Scanner(System.in);
            score = scanner2.next();


            String edadARI = edad(ARI);
            String edadFK = edad(FK);
            String edadSMOG = edad(SMOG);
            String edadCL= edad(CL);

            switch (score) {
                case "ARI":
                    System.out.println("Automated Readability Index: " + ARI + "(about " + edadARI + " year olds)");
                    break;
                case "FK":
                    System.out.println("Flesch–Kincaid readability tests: " + FK + "(about " + edadFK + " year olds)");
                    break;
                case "SMOG":
                    System.out.println("Simple Measure of Gobbledygook: " + SMOG + "(about " + edadSMOG + " year olds)");
                    break;
                case "CL":
                    System.out.println("Coleman–Liau index: " + CL + "(about " + edadCL + " year olds)");
                    break;
                case "all":
                    System.out.println("Automated Readability Index: " + ARI + "(about " + edadARI + " year olds)");
                    System.out.println("Flesch–Kincaid readability tests: " + FK + "(about " + edadFK + " year olds)");
                    System.out.println("Simple Measure of Gobbledygook: " + SMOG + "(about " + edadSMOG + " year olds)");
                    System.out.println("Coleman–Liau index: " + CL + "(about " + edadCL + " year olds)");
                    int edadMedia = (Integer.parseInt(edadARI) + Integer.parseInt(edadFK) + Integer.parseInt(edadSMOG) + Integer.parseInt(edadCL) ) / 4;
                    System.out.println("This text should be understood in average by " + edadMedia + " year olds");

                    break;
                default:
                    System.out.println("Not valid");
            }

        }
    }
}