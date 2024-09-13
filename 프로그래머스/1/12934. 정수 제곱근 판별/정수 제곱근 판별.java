import java.lang.Math;
class Solution {
    public long solution(long n) {
        long answer = 0;
        double a = Math.sqrt(n);
        if(a%1!=0){
            return -1;
        }
        
        return ((long)a+1)*((long)a+1);
    }
}