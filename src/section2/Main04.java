package section2;

import java.util.Scanner;

// 피보나치 수열
public class Main04 {
    public void solution(int n){
        int a=1, b=1, c;
        System.out.print(a+" "+b+" ");
        for(int i=2; i<n; i++){
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }

    public static void main(String[] args){
        Main04 T = new Main04();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        T.solution(n);
    }
}