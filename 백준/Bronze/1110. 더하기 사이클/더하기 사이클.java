import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int origin = Integer.parseInt(st.nextToken());
        int cnt = 0; // 사이클 수
        int num = origin; // 결과 수
        int left, right;
        while (true) {
            cnt++;
            left = num / 10;
            right = num % 10;
            num = right * 10 + (left + right) % 10;
            if (origin == num) {
                break;
            }
        }
        System.out.println(cnt);
    }
}
