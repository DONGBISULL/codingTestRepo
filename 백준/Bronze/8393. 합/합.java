import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result = 0;
        for (int i = 1; i <= n; i++) { // stack 후입 선출
            result += i;
        }
        System.out.println(result);
    }
}
