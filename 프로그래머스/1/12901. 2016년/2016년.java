class Solution {
    public String solution(int a, int b) {
        int[] mond ={0,31,29,31,30,31,30,31,31,30,31,30,31};
        String[] mont = {"THU","FRI","SAT","SUN","MON","TUE","WED"};
        for(int i=0;i<a;i++){
            b+=mond[i];
        }
        return mont[b%7];
    }
}