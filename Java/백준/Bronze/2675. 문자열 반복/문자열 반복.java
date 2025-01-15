import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            int R = sc.nextInt();
            String S = sc.next(); 
            
            String result = S.chars()
                .mapToObj(c -> String.valueOf((char) c).repeat(R))
                .collect(Collectors.joining()); 
            
            System.out.println(result); 
        }
        sc.close();
    }
}