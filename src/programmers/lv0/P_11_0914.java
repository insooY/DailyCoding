package programmers.lv0;

import java.util.Scanner;

public class P_11_0914 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        String answer = "";

        for (int i = 0 ; i<str1.length(); i++){
            answer += String.valueOf(str1.charAt(i)) + String.valueOf(str2.charAt(i));
        }

        System.out.println(answer);


    }
}
