package section1;

import java.util.Scanner;

// 유효한 팰린드롬
public class Main07 {
    public String solution(String str) {
        String answer="NO";
        String tmp=new StringBuilder(str).reverse().toString();
        if(str.equalsIgnoreCase(tmp)) answer="YES";
        return answer;
    }

    public static void main(String[] args) {
        Main07 T = new Main07();
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        System.out.print(T.solution(str));
    }
}