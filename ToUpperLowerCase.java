import java.util.*;
class ToUpperLowerCase {
    public String solution(String str){
        String answer="";
        for(char x : str.toCharArray()){
            if(Character.isLowerCase(x)) answer+=Character.toUpperCase(x);
            else answer+=Character.toLowerCase(x);
            //아스키코드 이용하는 방식
//            if(x>=97 && x<=122) answer+=(char)(x-32);
//            else answer+=(char)(x+32);
        }
        return answer;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        System.out.print(T.solution(str));
    }
}