class Solution {
       public int fac(int a){
        if(a>1){
            return a*fac(a-1);
        } else {
            return 1;
        }
       }
    public int solution(int n) {
        int answer = 0;
        for(int i=1;i<11;i++){
            if( n >= fac(i) ) {
                answer=i;    
        
        }
        }
        return answer;
    }
    
}