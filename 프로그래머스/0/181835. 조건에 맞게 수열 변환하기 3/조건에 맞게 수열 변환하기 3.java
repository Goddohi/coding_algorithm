class Solution {
    public int[] solution(int[] arr, int k) {
        boolean holsu = (k%2 ==1);
        for (int i = 0 ; i < arr.length;i++ ){
            if(holsu){
                arr[i]*=k;
            }else{
                arr[i]+=k;
            }
        
        }
        return arr;
    }
}