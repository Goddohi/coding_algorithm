class Solution {
    public int solution(int n) {
        int answer = 0;
        int i = n%2;
        for(;i<=n;i+=2){
            if(n%2 ==1){
                answer+=i;
            }else{
                 answer+=i*i;
            }
            
        }
        return answer;
    }
}