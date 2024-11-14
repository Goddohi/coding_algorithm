import java.util.Arrays;

class Solution {
    public String solution(String s) {
        char[] sArray = s.toCharArray();
        // 오름차순 정렬
        Arrays.sort(sArray);
        
        // 내림차순으로 뒤집기
        for (int i = 0; i < sArray.length / 2; i++) {
            char temp = sArray[i];
            sArray[i] = sArray[sArray.length - i - 1];
            sArray[sArray.length - i - 1] = temp;
        }

        return new String(sArray);
    }
}