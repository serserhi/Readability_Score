

class ConteoArray {
    public static void main(String[] args) {
        // put your code here

        String pathToFile = "prueba numero palabras";
        String[] palabras = pathToFile.split(" ");

        System.out.println(palabras.length);
        System.out.println(palabras[0].length());
    }
}