class Solution {
    boolean solution(String s) {
        int pcount =0, ycount=0;
        for(char i : s.toCharArray()){
            switch(i){
                case 'p': case'P': pcount++; break;
                case 'y': case'Y': ycount++; break;
                default: break;
            }
        }
        
        return pcount == ycount;
    }
}