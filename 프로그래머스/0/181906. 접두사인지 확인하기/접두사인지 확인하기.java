class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        int len_prefix = is_prefix.length();
        if(len_prefix<=my_string.length()){
            answer = is_prefix.equals( my_string.substring(0, len_prefix) ) ? 1 : 0;     
        }
        return answer;
    }
}