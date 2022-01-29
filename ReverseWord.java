import java.util.*;
class ReverseWord {
	public static void main(String[] args){
		ReverseWord T = new ReverseWord();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		String[] str=new String[n];
		for(int i=0; i<n; i++){
			str[i]=kb.next();
		}
		for(String x : T.solution(n, str)){
			System.out.println(x);
		}
	}
	public ArrayList<String> solution(int n, String[] str) {
		//1번 방식
		ArrayList<String> answer = new ArrayList<>();
		for (String x : str) {
			String tmp = new StringBuilder(x).reverse().toString();
			answer.add(tmp);
		}
		//2번 방식
//		for(String x : str){
//			char[] s=x.toCharArray();
//			int lt=0, rt=x.length()-1;
//			while(lt<rt){
//				char tmp=s[lt];
//				s[lt]=s[rt];
//				s[rt]=tmp;
//				lt++;
//				rt--;
//			}
//			String tmp=String.valueOf(s);
//			answer.add(tmp);
//		}
		return answer;
	}
}