
class Problem {

    public static void main(String[] args) {
        int resultado = 0;
        int numero1 = Integer.parseInt(args[1]);
        int numero2 = Integer.parseInt(args[2]);
        switch (args[0]) {
            case "+":
                resultado = numero1 + numero2;
                System.out.println(resultado);
                break;
            case "-":
                resultado = numero1 - numero2;
                System.out.println(resultado);
                break;
            case "*":
                resultado = numero1 * numero2;
                System.out.println(resultado);
                break;
            default:
                System.out.println("Unknown operator");
        }

    }
}