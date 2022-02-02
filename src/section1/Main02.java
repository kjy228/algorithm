package section1;

import java.util.*;

// 대소문자 변환
public class Main02 {
    /**
     * Character 클래스 함수 사용
     */
    public String solutionA(String str) {
        String answer = "";

        for (char x : str.toCharArray()) {
            if (Character.isLowerCase(x)) {
                answer += Character.toUpperCase(x);
            } else {
                answer += Character.toLowerCase(x);
            }
        }
        return answer;
    }

    /**
     * 아스키 코드 이용
     * - 대문자 65 ~ 90
     * - 소문자 97 ~ 122
     */
    public String solutionB(String str) {
        String answer = "";

        for (char x : str.toCharArray()) {
            if (x >= 97 && x <= 122) {
                answer += (char) (x - 32); // 대문자로 변환
            } else {
                answer += (char) (x + 32);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main02 T = new Main02();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        System.out.print(T.solutionA(str));
    }
}
