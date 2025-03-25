class Solution {
    public int solution(int a, int b) {
        // 1. int -> String 
        String strA = String.valueOf(a); 
        String strB = String.valueOf(b); 
                
        // 2. calculation 
        String ab = strA + strB; 
        String ba = strB + strA; 
        
        // 3. parse to int 
        int resultAB = Integer.parseInt(ab);
        int resultBA = Integer.parseInt(ba);
        
        // 4. return MAX ( if same, return A+B )
        return resultAB >= resultBA ? resultAB : resultBA; 
        
    }
}