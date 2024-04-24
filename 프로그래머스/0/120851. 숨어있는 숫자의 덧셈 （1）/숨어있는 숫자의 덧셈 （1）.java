class Solution {
    public int solution(String my_string) {
        String str="";
        int aw=0,i=0;
        str= my_string.replaceAll("[^0-9]", "");
        int[] answer = new int[str.length()];
        for (i = 0; i < str.length(); i++)
            answer[i] = str.charAt(i) - '0';
        for (int j =0; j <i; j++)
            aw = aw+answer[j];
        return aw;   
    }
}