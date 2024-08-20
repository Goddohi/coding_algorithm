class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        for(long i=1L;i<=n;i++){
            answer[(int)i-1]=x*i;
        }
        return answer;
    }
}