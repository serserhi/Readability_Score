import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().trim().split(" ");

        boolean alphabetical = true;
        String lastOne = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].compareTo(lastOne) < 0) {
                alphabetical = false;
                break;
            }
            lastOne = arr[i];
        }

        System.out.println(alphabetical);
    }
}