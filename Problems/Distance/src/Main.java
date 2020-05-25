import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int miles = scanner.nextInt();
        int hours = scanner.nextInt();
        double speed = miles / hours;
        System.out.println(speed);
    }
}