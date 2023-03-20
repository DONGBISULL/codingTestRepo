import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            arr[i] = a;
        }
        int[] filterArr = Arrays.stream(arr).filter(item -> item < x).toArray();
        String result = "";
        for (int a : filterArr) {
            result += a + " ";
        }
        System.out.println(result);
    }
}
