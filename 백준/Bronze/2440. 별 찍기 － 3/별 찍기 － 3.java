import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int result = in.nextInt();
        in.close();
        for (int i = 1; i <= result; i++) {
            for (int j = result ; j > i - 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
