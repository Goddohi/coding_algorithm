class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while(n>=a){
            answer += b*((n-(n%a))/a); //answer += b*(n/a); 해도 괜찮다
            n=b*((n-(n%a))/a)+n%a; //n=b*(n/a)+n%a; 해도 괜찮다
        }
         
        return answer;
    }
}
