import java.util.ArrayList;

class Solution {
    public String[] solution(String[] strArr) {
        ArrayList<String> answer = new ArrayList<>();
        
        for (String str : strArr) {
            if (!str.contains("ad")) {
                answer.add(str);
            }
        }
        //return answer.toArray(new String[answer.size()]);
        //return answer.toArray(new String[0]);
        //String[]::new는 필요한 크기의 String 배열을 생성하는 배열 생성자 참조
        return answer.toArray(String[]::new );  
        
    }
}