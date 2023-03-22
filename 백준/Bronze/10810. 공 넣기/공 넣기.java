import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 바구니 개수
        int m = Integer.parseInt(st.nextToken()); // 공 넣을 횟수
        int[] basket = new int[n]; //바구니
        for (int i = 0; i < n; i++) { //  바구니 기본 값 세팅
            basket[0] = 0;
        }
        int begin, end, num;
        for (int i = 1; i <= m; i++) {
            StringTokenizer stz = new StringTokenizer(br.readLine());
            begin = Integer.parseInt(stz.nextToken());
            end = Integer.parseInt(stz.nextToken());
            num = Integer.parseInt(stz.nextToken());
            for (int j = begin; j <= end ; j++) {
                basket[j - 1] = num;
            }
        }
        String result = "";
        for (int item : basket) {
            result += item + " ";
        }
        System.out.println(result);
    }
}
