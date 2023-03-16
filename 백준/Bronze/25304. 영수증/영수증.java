import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int total = in.nextInt(); // 최종금액
        int n = in.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) { // stack 후입 선출
            int price = in.nextInt();
            int num = in.nextInt();
            sum += price * num;
        }
        System.out.println(sum == total ? "Yes" : "No");
    }
}
