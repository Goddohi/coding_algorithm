import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> list = new ArrayList<Integer> ();
        for(int a : arr){
            list.add(a);
        }
        for(int del : delete_list){
            if(list.contains(del)){
                list.remove(Integer.valueOf(del)); // del을 인덱스가 아닌 값으로 인식하게 한다    
            }
        }
        int[] answer = new int[list.size()];
        for(int i=0; i<answer.length;i++){
            answer[i]=list.get(i);
        }
        return answer;
    }
}