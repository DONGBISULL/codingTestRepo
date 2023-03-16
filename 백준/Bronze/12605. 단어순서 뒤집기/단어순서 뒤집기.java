import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        for (int i = 0; i < n; i++) { // stack 후입 선출
            Stack<String> stack = new Stack<>();
            String input = in.nextLine();
            String[] inputs = input.split(" ");
            for (String ans : inputs) {
                stack.push(ans);
            }
            String result = "Case #" + (i+1) +": ";
            while (!stack.empty()) {
                result+=(stack.pop() + " ");
            }
            System.out.println(result);
        }
    }
}
