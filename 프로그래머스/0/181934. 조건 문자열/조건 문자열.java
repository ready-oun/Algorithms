class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        String condition = ineq + eq; 
        // ineq는 "<"와 ">" 중 하나이고, eq는 "="와 "!" 중 하나 --> 1: 0
        switch (condition){
            case "<=":
                return n <= m ? 1 : 0; 
            case ">=":
                return n >= m ? 1 : 0; 
            case "<!":
                return n < m ? 1 : 0; 
            case ">!": 
                return n > m ? 1 : 0; 
            default: 
                return 0; 
        }
    }
}