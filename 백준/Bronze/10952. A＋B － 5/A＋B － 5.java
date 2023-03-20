import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a, b;
        while (true) {
            a = sc.nextInt();
            b = sc.nextInt();
            if (a == 0 && b == 0) {
                sc.close();
                break;
            } else {
                System.out.println(a + b);
            }
        }
    }
}
