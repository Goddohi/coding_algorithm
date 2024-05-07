class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        //매순간 나머지저장소
        int temp = 0;
        int give = 0;
        while(n>=a){
            temp = n%a;
            give = b*((n-temp)/a);
            answer += give;
            n=give+temp;
        }
         
        return answer;
    }
}