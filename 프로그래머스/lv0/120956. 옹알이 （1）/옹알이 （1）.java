class Solution {
      public int solution(String[] babbling) {
          int answer = 0;
        String[] checkWordArr = new String[]{"aya", "ye", "woo", "ma" };
        String[] repeatbabblingArr = {"ayaaya", "yeye", "woowoo", "mama"};
        for (String word : babbling ){
            for (String repeat : repeatbabblingArr){
                word = word.replaceFirst(repeat, "X");
            }
            for (String check: checkWordArr) {
               word =  word.replaceFirst(check," ");
            }
            if(word.trim().length() == 0){
                answer++;
            }
        }
           return answer;
    }
}