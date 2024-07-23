class Solution {
    public String solution(String myString, String pat) {
        int len = myString.lastIndexOf(pat);
        String answer=myString.substring(0,len+pat.length());
        
        return answer;
    }
}