package section1;

import java.util.*;

// 문장 속 단어
public class Main03 {
    /**
     * split() 이용
     */
    public String solutionA(String str){
        String answer = "";
        int m = Integer.MIN_VALUE;

        String[] s = str.split(" ");
        for (String x : s) {
            int len = x.length();
            if (len > m) {
                m = len;
                answer = x;
            }
        }
        return answer;
    }

    /**
     * indexOf(), substring() 이용
     */
    public String solutionB(String str){
        String answer = "";
        int m = Integer.MIN_VALUE;
        int pos; // 단어와 단어사이에 존재하는 공백문자의 인덱스 위치 저장

        // 띄어쓰기를 발견 못할 경우 index number return
        while ((pos = str.indexOf(" ")) != -1) {
            String tmp = str.substring(0, pos);

            int len = tmp.length();
            if (len > m) {
                m = len;
                answer = tmp;
            }
            str = str.substring(pos + 1);
        }
        // 마지막 단어 검사 처리
        if (str.length() > m) answer = str;
        return answer;
    }

    public static void main(String[] args) {
        Main03 T = new Main03();
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        System.out.print(T.solutionA(str));
    }
}
