class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while(n>=a){
            answer += b*((n-(n%a))/a);
            n=b*((n-(n%a))/a)+n%a;
        }
         
        return answer;
    }
}