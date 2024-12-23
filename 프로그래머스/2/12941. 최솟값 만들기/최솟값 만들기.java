import java.util.*;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        
        Arrays.sort(A);
        Arrays.sort(B);
        int frontA =0,frontB=0,backA=A.length-1,backB=B.length-1;
        while(frontA!=backA){
            if(A[backA] * B[frontB] > B[backB] * A[frontA]){
                answer += A[backA] * B[frontB];
                backA--;
                frontB++;
            }else{
                answer +=  B[backB] * A[frontA];
                backB--;
                frontA++;
            }
            
            }

        answer +=  B[backB] * A[frontA];
        return answer;
    }
}