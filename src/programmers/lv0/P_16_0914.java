package programmers.lv0;

import java.util.Scanner;

public class P_16_0914 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int answer = 0;

        String A = String.valueOf(a);
        String B = String.valueOf(b);

        int answerA = Integer.valueOf(A+B);
        int answerB = Integer.valueOf(B+A);

        if (answerA > answerB){
            answer = answerA;
        }
        else {
            answer = answerB;
        }

        System.out.println(answer);
    }
}
