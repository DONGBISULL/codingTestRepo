import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int result = 0;
        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();
        int a;
        int b;
        for (int i = 1; i <= time; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.println(a + b);
        }
    }
}