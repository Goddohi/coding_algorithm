import java.util.ArrayList;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> answer_list = new ArrayList<Integer>();
       for(int i = l; i < r + 1; i++) {
           if(i%5 != 0){
               continue;
           }
           String strNum = String.valueOf(i);
           boolean count = true;
           for(int j = 0; j < strNum.length(); j++) {
                if(strNum.charAt(j) != '0' && strNum.charAt(j) != '5') {
                    count= false;
                    break;
                }
            }
           if(count ==true)
               answer_list.add(i);
        }
        return list_array(answer_list);
    }
      
 
    
    public int[] list_array(ArrayList<Integer> list){
        if(list.size()==0){
            int[] i = {-1};
            return i;
        }
        int[] i = new int[list.size()];
        for(int k=0;k<list.size();k++){
            i[k]=list.get(k);
        }
        return i;
    }
}
