import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int NumberA = scanner.nextInt();
        int NumberB = scanner.nextInt();
        int Sum = 0;
        for (int i = NumberA; i <= NumberB; i++) {
            Sum += NumberA;
            NumberA++;
        }
        System.out.println(Sum);
    }
}