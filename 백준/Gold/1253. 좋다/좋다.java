import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        long[] numbers = new long[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = Long.parseLong(st.nextToken());
        }

        // stream
//        long[] num = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();

        Arrays.sort(numbers);


        int answer = 0;
        // 각 숫자(numbers[i])가 다른 두 수의 합으로 표현되는지 투 포인터 검색
        for (int i = 0; i < numbers.length; i++) {
            // 배열의 인덱스는 int 타입임. 따라서 left와 right를 int로 선언함.
            int left = 0, right = N-1;
            while (left < right) {  
                // left == i
                if (left == i) {
                    left++;
                    continue;
                }
                // right == i
                if (right == i) {
                    right--;
                    continue;
                }

                long sum = numbers[left] + numbers[right];
                // sum == left v + right v -> answer++; break;
                if (sum == numbers[i]) {
                    answer++;
                    break;
                } else if (sum < numbers[i]) {
                    left++; // in order to increase sum 
                } else right--; // to decrease sum 
            }
        }

        System.out.println(answer);  
    }
}