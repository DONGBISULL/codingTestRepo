import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String anwser = in.nextLine();
        in.close();
        long result = 0;
        String[] anwserArr = anwser.split(" ");
        for (String item : anwserArr) {
            result += Long.parseLong(item);
        }
        System.out.println(result);
    }
}
