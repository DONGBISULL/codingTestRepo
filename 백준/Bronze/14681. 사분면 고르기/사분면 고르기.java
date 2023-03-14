import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String result = "";
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        in.close();
        if (x > 0 && y > 0) {
            result = "1";
        } else if (x > 0 && y < 0) {
            result = "4";
        } else if (x < 0 && y > 0) {
            result = "2";
        } else {
            result = "3";
        }
        System.out.println(result);
    }
}
