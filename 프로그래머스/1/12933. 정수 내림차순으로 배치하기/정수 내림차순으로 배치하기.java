import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        // char[]를 Character[]로 변환
        Character[] chars = new Character[String.valueOf(n).length()];
        
        // char[]에서 Character[]로 값 복사
        for (int i = 0; i < chars.length; i++) {
            chars[i] = String.valueOf(n).charAt(i);
        }
        
        // 내림차순 정렬
        Arrays.sort(chars, Collections.reverseOrder());
        
        // 정렬된 배열을 다시 문자열로 변환
        StringBuilder sortedStr = new StringBuilder();
        for (Character c : chars) {
            sortedStr.append(c);
        }
        
        // 최종 결과를 long으로 변환
        return Long.parseLong(sortedStr.toString());
    }
}
