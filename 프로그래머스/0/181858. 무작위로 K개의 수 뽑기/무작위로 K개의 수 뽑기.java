import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        List<Integer> answerList = new ArrayList<>();
        int count =0;
        for(int a : arr){
            if(answerList.indexOf(a) == -1){
                answerList.add(a);
                count++;
            }
            if(k<=count){
                break;
            }
        }
        for(;count<k;count++){
            answerList.add(-1);
        }
        
        return answerList.stream().mapToInt(i -> i).toArray();
    }
}