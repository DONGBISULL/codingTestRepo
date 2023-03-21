import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  
        int num; 
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            num = sc.nextInt();
            arr[i] = num;
        }
        Arrays.sort(arr);
        String result = arr[0] + " " + arr[n-1];
        System.out.println(result);
    }
}
