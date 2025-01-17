import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(); 
        
        // 두 정수 n행과 m열 중 n을 저장 
        int n = Integer.parseInt(br.readLine().split(" ")[0]);
        
        // 배열뒤집기 반복문
        for (int i = 0; i < n; i++) {
            String s = br.readLine(); 
            sb.append(new StringBuilder(s).reverse().append("\n"));
        }
        System.out.println(sb);
        br.close(); 
    }
}