class Solution {
   /*
    public int solution(int balls, int share) {
        int answer = fac(balls) / (fac(balls-share)*fac(share));
        
        return answer;
    }
    public int fac(int a){
        if(a>1){
            return a*fac(a-1);
        } else {
            return 1;
        }
    }
    */
     //공식풀이로 하니 문제가 생겨서 다른방법을 찾아봤다 C를 사용하는 방식
 
    public static int nCr(int n,int r){
        if (r==n || r==0) return 1; // r이 같거나 0일떄 1이라서 
        return nCr((n-1),(r-1)) + nCr(n-1,r);
         //nCr = n-1Cr+n-1Cr-1과 같다
     }
     public int solution(int balls, int share) {
        return nCr(balls, share);
    }
    
}