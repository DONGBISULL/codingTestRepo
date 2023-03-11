import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String anwser = in.nextLine();
        in.close();
        String[] anwserArr = anwser.split(" ");
        String result = "";
        int[] chessArr = {1, 1, 2, 2, 2, 8};
        for (int i = 0; i <= anwserArr.length - 1; i++) {
            result += chessArr[i] - Integer.parseInt(anwserArr[i]);
            if (i != anwserArr.length) {
                result += " ";
            }
        }
        System.out.println(result);
    }
}
