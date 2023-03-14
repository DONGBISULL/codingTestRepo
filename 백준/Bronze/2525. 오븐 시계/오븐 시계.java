import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h = in.nextInt();
        int m = in.nextInt();
        int time = in.nextInt();
        in.close();
        int min = 60 * h + m;
        min += time;
        h = (min / 60) % 24;
        m = min % 60;
        System.out.println(h + " " + m);
    }
}
