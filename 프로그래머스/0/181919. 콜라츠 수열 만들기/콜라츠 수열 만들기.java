import java.util.Arrays;
class Solution {
    public int[] solution(int n) {
        int[] answer = {n};
        while(n!=1){
            if(n%2==0){
                n /=2;
            }else{
                n = n*3 +1;
            }
            answer = add(answer,n);
        }
        return answer;
    }
    
    public int[] add(int[] a, int add){
        int len = a.length;
        a = Arrays.copyOf(a, len + 1);
        a[len]= add;
        return a;
    }
}