import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        Arrays.sort(nums);  
        for(int i =0; i<nums.length;i++) {
            if(i==0||nums[i]!=list.get(list.size() - 1))
                list.add(nums[i]);
            }
          return list.size()>nums.length/2 ? nums.length/2 :list.size();
    }
}
