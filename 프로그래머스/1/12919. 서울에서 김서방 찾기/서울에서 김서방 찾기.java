class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        int a = 0;
        for(String name : seoul){
            if(name.equals("Kim")){
                answer = "김서방은 "+a+"에 있다";
                break;    
            }
            a++;
        }
        return answer;
    }
}