import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String m = br.readLine();
        int result = 0;
        for (int i = 0; i < n; i++) {
            result += m.charAt(i) - 48; // 아스키코드 반환 0의 아스키 코드인 48빼기
        }
        System.out.println(result);
    }
}
