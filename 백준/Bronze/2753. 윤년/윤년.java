import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String result = "";
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        in.close();
        if ((a % 4 == 0) && (a % 100 != 0)) {
            result = "1";
        } else if (a % 400 == 0) {
            result = "1";
        } else {
            result = "0";
        }
        System.out.println(result);
    }
}
