import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String result = "";
        int num = n / 4;
        for (int i = 1; i <= num; i++) {
            result += "long ";
        }
        System.out.println(result + "int");
    }
}
