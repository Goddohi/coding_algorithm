class Solution {
    public int[] solution(long n) {
        int setting = 자리수(n);
        int[] answer = new int[setting];
        for(int i=0; i<setting;i++){
            answer[i]=(int)(n%10);
            n/=10;
        }
        return answer;
        
    }
    
    public int 자리수(long n){
        int count =0;
        while(n!=0){
            n /= 10;
            count++;
        }
        return count;
    }
}