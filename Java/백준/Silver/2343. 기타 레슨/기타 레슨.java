import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); // 강의수
        int m = sc.nextInt(); // 블루레이 수 
        int[] lessons = new int[n];
        int maxLesson = 0; // 길이가 가장 긴 강의 -> 최소값 결정 
        int sumLessons = 0; // 강의길이 총합 -> 최대값 결정 
        
        // 입력
        for (int i = 0; i < n; i++) {
            lessons[i]= sc.nextInt(); // 각 강의길이 입력 
            maxLesson = Math.max(maxLesson, lessons[i]); // 가장 긴 강의 길이 갱신 
            sumLessons += lessons[i]; // 강의길이 총합계산 갱신 
        }
        
        int start = maxLesson; // 블루레이 최소크기
        int end = sumLessons; // 블루레이 최대크기 
        int result = end; // 최적값
        
        while (start <= end) {
            int mid = start + (end - start) / 2; // 오버플로우 방지 중간값 계산 
            
            if (canDivide(lessons, n, m, mid)) {
                result = mid; // 조건 만족 시 결과 갱신
                end = mid - 1; // 더 작은 크기 탐색 
           
            } else {
                start = mid + 1; // 더 큰 크기 탐색 
            }
        }
        System.out.println(result); 
        
    }
    
    // 블루레이 개수 확인 func
    private static boolean canDivide(int[] lessons, int n, int m, int maxSize) {
        int count = 1; // 블루레이 개수
        int sum = 0; // 현재 블루레이에 담긴 강의길이 합 
        
        for (int lesson: lessons) {
            if (sum + lesson > maxSize) {
                count++; // 새로운 블루레이 사용 
                sum = lesson; // 현재 강의를 새 블루레이에 담음 
                if (count > m) return false; // 블루레이 개수 초과 시 실패 
            } else {
                sum += lesson; // 현재 블루레이에 추가 
            }
        }
        return true; 
    }
}