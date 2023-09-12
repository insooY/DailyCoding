package programmers.lv0;

import java.util.Scanner;

public class P_4_0912 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        System.out.println(solution(a));
    }

    public static String solution(String str) {
        String answer = "";

        for (char i : str.toCharArray()){
            if (i>=97 && i<=122){
                answer+=(char)(i-32);
            } else if (i>=65 && i<=90) {
                answer+=(char)(i+32);
            }
        }
        return answer;
    }
}
