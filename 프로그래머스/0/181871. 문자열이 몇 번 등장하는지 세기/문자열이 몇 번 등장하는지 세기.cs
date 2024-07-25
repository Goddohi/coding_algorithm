using System;

public class Solution {
    public int solution(string myString, string pat) {
        int answer = 0;
        for(int i=0;i<myString.Length;i++){
            if(myString.IndexOf(pat,i) == -1){
                break;
            }else{
                i = myString.IndexOf(pat,i);
                answer++;
            }
        }
        return answer;
    }
}