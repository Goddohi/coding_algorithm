class Solution {
    public String solution(String[] arr) {
        StringBuilder answer = new StringBuilder();
        for(String temp : arr){
            answer.append(temp.charAt(0));
        }
        return answer.toString();
    }
}