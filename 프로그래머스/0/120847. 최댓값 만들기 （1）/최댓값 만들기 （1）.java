class Solution {
    public int solution(int[] numbers) {
        int max1=-1,max2=-1;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i] > max1){
                max2=max1;
                max1=numbers[i];
            }
            else if(max2 <= numbers[i]){
                max2=numbers[i];
            }
        }
        return max1*max2;
    }
}