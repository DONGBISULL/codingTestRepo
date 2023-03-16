import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> hariMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String type = in.next();
            int num = in.nextInt();
            if(hariMap.containsKey(type)) {
                hariMap.put( type ,hariMap.get(type) + num);
            }else{
                hariMap.put( type , num);
            }
        }
        String result = "NO";
        for(String key : hariMap.keySet()){
            if(hariMap.get(key) == 5 ) result = "YES";
        }
        System.out.println(result);
    }
}
