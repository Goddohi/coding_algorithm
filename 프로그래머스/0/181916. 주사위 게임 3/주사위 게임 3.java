import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        HashSet<Integer> hst = new HashSet();
        hst.add(a);
        hst.add(b);
        hst.add(c);
        hst.add(d);
        
        switch(hst.size()){
            case 1: answer=a*1111;break;
            case 2: 
                int temp = (a==b ? 1 : 0) +(a==c ? 1 : 0)+(a==d ? 1 : 0);
                if(temp==1){
                    temp = ((a+b+c+d) - 2*a)/2;
                    answer = (a+temp)*Math.abs(a-temp);
                }else if (temp==0){
                    answer = (10*b +a)*(10*b +a);
                }else {
                    temp = (a+b+c+d) - 3*a;
                    answer = (10*a +temp)*(10*a +temp);  
                }
                break;
                
            case 3:
                if(a==b){
                    answer= c*d;
                }else if(a==c){
                    answer=b*d;
                }else if(a==d){
                    answer=b*c;
                }else if(b==c){
                    answer=a*d;
                }else if(b==d){
                    answer=a*c;
                }else if(c==d){
                    answer=a*b;
                }
                break;
            default: 
                answer = Collections.min(hst);
    
        }
        return answer;
    
    }
}