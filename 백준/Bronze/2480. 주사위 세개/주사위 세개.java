import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int result = 0;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a != b && b != c && a != c) {
            int max = 0;
            if (a > b) {
                if (c > a){
                    max = c;
                } else {
                    max = a;
                }
             // b > a
            } else {
                if ( c > b ) {
                    max = c;
                }else {
                    max = b;
                }
            }
            result = max * 100;
        } else {
            if (a == b && c == a) {
                result = 10000 + 1000 * a;
            } else {
                if ( a==b || a == c){
                    result = 1000 + 100 * a;
                }else {
                    result = 1000 + 100 * c;
                }
            }
        }
        System.out.println(result);
    }
}