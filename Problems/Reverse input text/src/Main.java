import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // start coding here
        int entrada = reader.read();
        char[] secuencia = new char[50];
        int i = 0;
        int maximo;
        while (entrada != -1){
            secuencia[i] = (char) entrada;
            i++;
            entrada =  reader.read();
        }
        maximo = i - 1;
        i = 0;
        while ((maximo - i) >= 0) {
            System.out.print(secuencia[maximo - i]);
            i++;
        }
        reader.close();
    }
}