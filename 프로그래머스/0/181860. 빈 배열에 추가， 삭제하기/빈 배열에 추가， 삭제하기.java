import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {

        List<Integer> answerList =  new ArrayList<>();
        for(int i=0 ; i<arr.length;i++){
            if(flag[i]){
                 for(int j=0 ; j<arr[i]*2;j++)
                     answerList.add(arr[i]);
            }else{
                for(int j=0 ; j<arr[i];j++)
                    if(answerList.size()>0)
                       answerList.remove(answerList.size()-1);
            }
        }        
        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        
        return answer;
    }
}