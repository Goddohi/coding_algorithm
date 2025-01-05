class Solution {
    public int solution(int n) {
        String ternaryNumber = convertToTernary(n);
        int answer = convertToDecimal(ternaryNumber);
        return answer;
    }
   
    public String convertToTernary(int decimal) {
        if (decimal == 0) {
            return "0";
        }
        
        StringBuilder ternary = new StringBuilder();
        
        while (decimal > 0) {
            int remainder = decimal % 3;
            ternary.append(remainder);
            decimal /= 3;
        }
        // `append`로 만든 문자열은 이미 뒤집혀 있음.
        return ternary.toString();
    }

    public int convertToDecimal(String ternary) {
        int decimal = 0;
        int length = ternary.length();
        
        for (int i = 0; i < length; i++) {
            // 각 자리 값을 가져오기
            int digit = Character.getNumericValue(ternary.charAt(i));
            
            // 3^n을 곱해서 더하기
            decimal += digit * Math.pow(3, length - i - 1);
        }
        
        return decimal;
    }

}