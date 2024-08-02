import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> stk = new ArrayList<>();
        for(int i = 0 ; i <arr.length;i++){ // 주어진 조건은 for문을 의미한다.
            int size = stk.size();
            if(size==0){
                stk.add(arr[i]);
            }else if(stk.get(size-1)==arr[i]){
                stk.remove(size-1);
            }else if(stk.get(size-1)!=arr[i]){  //else해도 괜찮다.
                stk.add(arr[i]);           
            }
        }
        
        if(stk.size() == 0){
            int[] answer = {-1}; 
            return answer;
        }
        
        int[] answer = new int[stk.size()];
        for(int i = 0 ; i <answer.length;i++){
            answer[i]=stk.get(i);
        }
        
        return answer;     
    }
}