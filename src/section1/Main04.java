package section1;

import java.util.*;

// 단어 뒤집기
public class Main04 {
    /**
     * StringBuilder 클래스를 이용하여 문자 뒤집기
     */
    private ArrayList<String> solutionA(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        for (String x : str) {
            // StringBuilder -> 문자열을 다루는 클래스
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }
        return answer;
    }

    /**
     * 특정 문자 직접 뒤집기
     */
    private ArrayList<String> solutionB(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        for (String x : str) {
            char[] s = x.toCharArray();
            int lt = 0, rt = x.length() - 1;
            while (lt < rt) {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt++;
            }
            String tmp = String.valueOf(s);
            answer.add(tmp);
        }
        return answer;
    }

    public static void main(String[] args) {
        Main04 T = new Main04();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
        }
        for (String x : T.solutionB(n, str)) {
            System.out.println(x);
        }
    }
}
