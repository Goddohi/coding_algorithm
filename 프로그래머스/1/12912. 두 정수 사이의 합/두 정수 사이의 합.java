class Solution {
    public long solution(int a, int b) {
       long answer = b;
        while(a!=b){
            answer +=a;
            a =  a>b ? a-1: a+1;  
        }
        return answer;
    
    }
}