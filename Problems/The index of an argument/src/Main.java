class Problem {
    public static void main(String[] args) {
        int salida = -1;
        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("test")) {
               salida = i;
            }
        }
        System.out.println(salida);
    }
}