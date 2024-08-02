import java.util.*;
class Solution {
    public String[] solution(String myStr) {
        String[] temp = myStr.replace("a"," ").replace("b"," ").replace("c"," ").replace("\\s"," ").split(" ");
        List<String> answer = new ArrayList<>();
        for(String a : temp){
            if(a.equals("")){
                continue;
            }
            answer.add(a);
        }
        if(answer.size()==0){
            String[] answerempry  ={"EMPTY"};
            return answerempry;
        }
        return answer.toArray(new String[answer.size()]);
    }
}