class Solution {
    public double solution(int[] arr) {
        int sum=0;
        int count;
        for (count= 0; count<arr.length;count++){
            sum+=arr[count];
        }
        
        return (1.0*sum)/count;
    }
}