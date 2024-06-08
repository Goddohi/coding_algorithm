import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> stk = new ArrayList<Integer>();
        for(int i=0; i<arr.length;){
            if(stk.size()==0){
                stk.add(arr[i]);
                    i++;
            }else if(stk.get(stk.size() - 1)<arr[i]){
                stk.add(arr[i]);
                i++;
                }else{
                    stk.remove(stk.size()-1);
                }
        }
        return list_array(stk);
    }
    public int[] list_array(ArrayList<Integer> stk){
        int[] a = new int[stk.size()];
        for(int i=0 ; i<stk.size();i++){
            a[i]=stk.get(i);
        }
        return a;
    }
    
}