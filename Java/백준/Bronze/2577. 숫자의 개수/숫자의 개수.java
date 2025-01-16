import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        // 0~9
        int[] counts = new int[10];

        // A * B * C = result <- counts
        int result = A*B*C;

        String resultString = String.valueOf(result);
        for(char c: resultString.toCharArray()) {
            counts[c - '0']++;
        }

        for (int i = 0; i < counts.length; i++) {
            System.out.println(counts[i]);
        }

        sc.close();
    }
}
