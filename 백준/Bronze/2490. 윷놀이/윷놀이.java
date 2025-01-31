import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        
        // 윷놀이 3줄 입력 & 결과 처리 
        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()); 
            
            // 공백구분 1 카운팅 
            int count = 0; 
            for (int j = 0; j < 4; j++) {
                count += Integer.parseInt(st.nextToken()); 
            }
            
            // 결과판단 switch case 
            switch (count) {
                case 0:
                    System.out.println("D");
                    break;
                case 1:
                    System.out.println("C");
                    break;
                case 2:
                    System.out.println("B");
                    break;
                case 3:
                    System.out.println("A");
                    break;
                case 4:
                    System.out.println("E");
                    break;

            }
        }
        
    }
}
/*
입력
첫째 줄부터 셋째 줄까지 각 줄에 각각 한 번 던진 윷짝들의 상태를 나타내는 네 개의 정수(0 또는 1)가 빈칸을 사이에 두고 주어진다.

출력
첫째 줄부터 셋째 줄까지 한 줄에 하나씩 결과를 도는 A, 개는 B, 걸은 C, 윷은 D, 모는 E로 출력한다.

1합
0개 → 윷(D)
1개 → 걸(C)
2개 → 개(B)
3개 → 도(A)
4개 → 모(E)
*/