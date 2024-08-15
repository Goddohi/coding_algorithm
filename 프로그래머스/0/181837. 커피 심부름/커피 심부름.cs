using System;

public class Solution {
    public int solution(string[] order) {
        int answer = 0;
        foreach(string dr in order){
            answer += dr.Contains("latte") ? 5000:4500;
        }
        return answer;
    }
}