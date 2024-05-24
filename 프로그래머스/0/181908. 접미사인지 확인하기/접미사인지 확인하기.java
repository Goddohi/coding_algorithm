class Solution {
    public int solution(String my_string, String is_suffix) {
        if(my_string.length()>=is_suffix.length()){
            String cutStr = my_string.substring(my_string.length()-is_suffix.length()); 
            System.out.println(cutStr);
            return cutStr.equals(is_suffix) ? 1 : 0 ;
        }
        return 0 ;
    }
}