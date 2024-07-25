class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        for(int i=0; i<myString.length(); i++) {
            if(myString.indexOf(pat,i)== -1){
                break;
            }else{
                i = myString.indexOf(pat,i);
                answer++;
            }
        }
        return answer;
    }
}