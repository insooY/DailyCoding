package programmers.lv0;

import java.util.Scanner;

public class P_18_0914 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n = sc.nextInt();
        int answer = 0;
        if (num % n ==0){
            answer = 1;
        }
        else {
            answer =0;
        }

        System.out.println(answer);
    }
}
