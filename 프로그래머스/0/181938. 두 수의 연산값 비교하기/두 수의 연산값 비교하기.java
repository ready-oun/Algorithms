class Solution {
    public int solution(int a, int b) {
        
        // a+b, 2 * a * b
        int aPlusB = Integer.parseInt(""+a+b); 
        int mult2ab = 2 * a * b; 
        
        // return MAX(values) if same, return a+b 
        return aPlusB >= mult2ab ? aPlusB : mult2ab; 
        
    }
}