using System;
using System.Linq;

public class Solution {
    public string[] solution(string my_string) {
        string[] answer = my_string.Split();
        answer = answer.Where(str=>str !="").ToArray();
        return answer;
    }
}