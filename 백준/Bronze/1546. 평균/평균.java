import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String ans = br.readLine();
        String[] arr = ans.split(" ");
        int max = 0;
        Double sum = 0.0;
        for (int i = 0; i < n; i++) { // 최대 값 구하기
            int temp = Integer.parseInt(arr[i]);
            if (max < temp) {
                max = temp;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            sum += Double.parseDouble(arr[i]) / max * 100;
        }
        System.out.println(sum / n);
    }
}
