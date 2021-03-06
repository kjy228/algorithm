package section1;

import java.util.Scanner;

// 특정 문자 뒤집기
public class Main05 {
    public String solution(String str) {
        String answer;
        char[] s = str.toCharArray();
        int lt = 0;
        int rt = str.length() - 1;

        while (lt < rt) {
            if (!Character.isAlphabetic(s[lt])) lt++;
            else if (!Character.isAlphabetic(s[rt])) rt--;
            else {  // 알파벳인 경우 자리 바꾸기
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(s);
        return answer;
    }

    public static void main(String[] args) {
        Main05 T = new Main05();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}