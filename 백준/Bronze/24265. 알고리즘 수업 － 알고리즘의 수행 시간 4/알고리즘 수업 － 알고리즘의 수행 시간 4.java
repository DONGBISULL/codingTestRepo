import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Long n = Long.parseLong(br.readLine());
        //2 입력 -> 1 (n-1) * n   => 1 * 2 = 2 결과값이 나오려면 2로 나눠야함
        //3 입력 -> 3             => 3 * 2 = 6 결과값이 나오려면 2로 나눠야함
        System.out.println(n * (n-1) /2 );
        System.out.println(2);
    }
}
