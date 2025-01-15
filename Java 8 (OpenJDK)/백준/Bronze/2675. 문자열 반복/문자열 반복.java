import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int t = 0; t < T; t++) {
            int R = sc.nextInt();
            String S = sc.next(); // 입력처리
            
            StringBuilder result = new StringBuilder(); // 출력처리 
            for (char c: S.toCharArray()) {
                for (int j = 0; j < R; j++) {
                    result.append(c);
                }
            }
            
            System.out.println(result.toString());
            
        }
        sc.close(); 
    }
}