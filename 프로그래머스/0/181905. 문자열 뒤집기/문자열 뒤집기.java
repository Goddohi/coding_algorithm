class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuilder answer = new StringBuilder(my_string.substring(0,s));
        int temp=e;
        for(int i=s; i<my_string.length();i++){
            if(i<=e){
                answer.append(my_string.charAt(temp--));
            }
            else{
                answer.append(my_string.charAt(i));
            }
        }
        return answer.toString();
    }
}