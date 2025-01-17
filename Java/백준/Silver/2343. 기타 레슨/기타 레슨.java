import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 1. 입력 
        int numLectures = sc.nextInt(); // 강의수 
        int numBlueRays = sc.nextInt(); // 블루레이수
        int[] lectures = new int[numLectures]; // 강의길이 배열 
        
        int maxLectureLength = 0; // 가장 긴 강의길이 (블루레이최소값)
        int totalLectureLength = 0; // 모든 강의길이 합 (블루레이최소값)
        
        for (int i = 0; i < numLectures; i++) {
            lectures[i] = sc.nextInt();
            maxLectureLength = Math.max(maxLectureLength, lectures[i]); // 가장 긴 강의 길이 구하기
            totalLectureLength += lectures[i]; // 강의길이 총합 구하기 
        }
        
        // 2. 이진 탐색 초기값 
        int start = maxLectureLength; // 블루레이 크기 최소값 
        int end = totalLectureLength; // 블루레이 크기 최대값 
        int result = end; // 최소 블루레이 크기 저장
        
        // 3. 이진탐색 시작
        while (start <= end) {
            int mid = start + (end - start) / 2; // 현재 블루레이 크기값 
            
            if (canDivide(lectures, numBlueRays, mid)) {
                result = mid; // 현재 크기로 가능한 경우 결과 갱신 
                end = mid - 1; // 더 작은 블루레이 크기 탐색 
            } else {
                start = mid + 1; // 현재 크기로 불가하면 더 큰 크기 탐색 
            }
        }
        System.out.println(result);
    }
    
    /**
     * 특정 블루레이 크기로 강의를 나눌 수 있는지 확인하는 함수
     * @param lectures 강의 길이 배열
     * @param maxBluRays 블루레이 최대 개수
     * @param maxSize 블루레이 크기
     * @return 강의를 M개의 블루레이 이하로 나눌 수 있으면 true, 그렇지 않으면 false
     */
    private static boolean canDivide(int[] lectures, int maxBlueRays, int maxSize) {
        int blueRayCount = 1; // 블루레이 개수
        int currentSum = 0; // 현재 블루레이에 담긴 강의 길이 합 
        
        for (int lecture: lectures) {
            // 현재 블루레이에 강의를 추가할 수 없는 경우
            if (currentSum + lecture > maxSize) {
                blueRayCount++; // 새로운블루레이 사용
                currentSum = lecture; // 현재 강의를 새 블루레이에 추가 
                if (blueRayCount > maxBlueRays) {
                    return false; // 블루레이 개수 초과 시 실패 
                }
            } else {
                currentSum += lecture; // 현재 블루레이에 강의 추가 
            }
        }
        return true; // 블루레이 개수 초과 없이 강의를 모두 나눌 수 있음 
    }
    
}