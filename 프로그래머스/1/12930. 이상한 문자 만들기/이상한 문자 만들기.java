class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        Boolean cnt = false;
        for(char c : s.toCharArray()){
            if(c == ' '){
               answer.append(c);
               cnt = true; //아래에서 false로 바뀜 
            }else if(cnt){
               answer.append(Character.toLowerCase(c));
            }else{
               answer.append(Character.toUpperCase(c));
            }
            cnt = !cnt;
        }              
        return answer.toString();
    }
}