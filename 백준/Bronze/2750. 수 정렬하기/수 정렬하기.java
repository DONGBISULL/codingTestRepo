import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 입력
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        int a;
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            a = Integer.parseInt(br.readLine());
            arr[i] = a;
        }
        Arrays.sort(arr);
        for (int item : arr) {
            bw.write(item + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
