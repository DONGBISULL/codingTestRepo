import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 입력
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int playTime = Integer.parseInt(st.nextToken()); // 플레이신청 횟수
        String playGame = st.nextToken();   // 게임종류
        Set<String> players = new HashSet<>();
        for (int i = 0; i < playTime; i++) {
            st = new StringTokenizer(br.readLine());
            players.add(st.nextToken());
        }
        String num = "";
        if ("Y".equals(playGame)) {
            num = players.size() + "";
        } else if ("F".equals(playGame)) {
            num = players.size() / 2 + "";
        } else if ("O".equals(playGame)) {
            num = players.size() / 3 + "";
        }
        bw.write(num);
        br.close();
        bw.flush();
        bw.close();
    }
}
