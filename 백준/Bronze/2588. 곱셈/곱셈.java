import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        in.close();
        String numbers = String.valueOf(b);
        char[] digits = numbers.toCharArray();
        int mul = 0;
        for (int i = digits.length - 1; i >= 0; i--) {
            mul = a * Character.getNumericValue(digits[i]);
            System.out.println(mul);
        }
        System.out.println(a * b);
    }
}
