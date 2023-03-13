import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String result = "";
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        in.close();
        if (a == b) {
            result = "==";
        } else if (a > b) {
            result = ">";
        } else {
            result = "<";
        }
        System.out.println(result);
    }
}
