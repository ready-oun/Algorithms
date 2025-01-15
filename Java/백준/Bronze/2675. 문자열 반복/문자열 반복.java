import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 1. 입력을 받기 위해 Scanner 객체 생성
        int T = scanner.nextInt(); // 2. 첫 번째 입력값: 테스트 케이스 개수를 받음

        for (int t = 0; t < T; t++) { // 3. 테스트 케이스 개수만큼 반복
            int R = scanner.nextInt(); // 4. 각 테스트 케이스의 첫 번째 값: 반복 횟수를 받음
            String S = scanner.next(); // 5. 각 테스트 케이스의 두 번째 값: 문자열을 받음

            // 6. Stream API를 이용해 각 문자를 R번 반복한 결과 문자열을 생성
            String result = S.chars() // 6.1. 문자열 S를 Stream으로 변환 (각 문자의 유니코드 값이 스트림 요소로 생성됨)
                             .mapToObj(c -> String.valueOf((char) c).repeat(R)) 
                             // 6.2. 각 유니코드 값을 문자로 변환한 후, R번 반복한 문자열로 매핑
                             .collect(Collectors.joining()); 
                             // 6.3. 매핑된 문자열들을 하나의 문자열로 연결

            System.out.println(result); // 7. 최종 생성된 문자열 출력
        }
        scanner.close(); // 8. Scanner 자원 해제
    }
}