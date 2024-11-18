class Solution {
    public long solution(int price, int money, int count) {
        long answer = (price* count*(1L+count)/ 2L) - money; 
        return  answer >= 0 ? answer : 0 ;
    }
}