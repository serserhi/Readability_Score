/* Please, do not rename it */
class Problem {

    public static void main(String[] args) {
        String operator = args[0];
        // write your code here
        int[] numeros = new int[50];
        int maximo;
        int minimo;
        int suma = 0;

        for (int i = 1; i < args.length; i++) {
            numeros[i - 1] = Integer.parseInt(args[i]);
        }
        switch (operator) {
            case "MAX":
                maximo = numeros[0];
                for (int i = 1; i < args.length - 1; i++) {
                    if (numeros[i] > maximo) {
                        maximo = numeros[i];
                    }
                }
                System.out.println(maximo);
                break;
            case "MIN":
                minimo = numeros[0];
                for (int i = 1; i < args.length - 1; i++) {
                    if (numeros[i] < minimo) {
                        minimo = numeros[i];
                    }
                }
                System.out.println(minimo);
                break;
            case "SUM":
                for (int i = 0; i < args.length - 1; i++) {
                        suma += numeros[i];
                }
                System.out.println(suma);
                break;
        }

    }
}