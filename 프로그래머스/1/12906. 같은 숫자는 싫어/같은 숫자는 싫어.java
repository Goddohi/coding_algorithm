import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> inarr = new ArrayList<>();
        
        for(int a : arr){
            if(inarr.size() == 0 || inarr.get(inarr.size() - 1) != a){
                inarr.add(a);
            }
        }
        

        return inarr.stream().mapToInt(Integer::intValue).toArray();
    }
}