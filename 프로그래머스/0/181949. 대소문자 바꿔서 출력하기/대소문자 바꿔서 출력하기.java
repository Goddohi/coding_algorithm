import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        for(int i=0;i<a.length();i++){
            int temp = (int)a.charAt(i);
            if(temp>=65 & temp<=90)
                temp +=32;
            else if(temp>=97 & temp<=122)
                temp -=32;
            
            System.out.print((char)temp);
            
        }
        
    }
}