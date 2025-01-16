
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine();

        // 알파벳 빈도수 저장 배열 (a~z: 인덱스 0~25)
        int[] counts = new int[26];

        // 각 문자에 대해 빈도수 계산
        for (char c : S.toCharArray()) {
            counts[c - 'a']++; // 입력된 문자열의 각 문자를 배열 인덱스에 매핑
        }

        for (int count : counts) {
            System.out.print(count + " ");
        }


        sc.close();

    }
}