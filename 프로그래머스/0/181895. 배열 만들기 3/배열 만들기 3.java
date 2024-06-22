import java.util.*;

class Solution {
    ArrayList<Integer> answerList = new ArrayList<>();
    
    public int[] solution(int[] arr, int[][] intervals) {
        for(int[] interval: intervals){
            inter(arr,interval);
        }
        int[] answer = new int[answerList.size()];
        for(int i = 0; i<answerList.size();i++){
            answer[i]=answerList.get(i);
            
        }
        return answer;
    }
    public void inter(int[] arr,int[] interval){
        for(int i=interval[0]; i<=interval[1];i++)
            answerList.add(arr[i]);
    }
}