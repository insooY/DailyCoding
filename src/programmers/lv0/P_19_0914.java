package programmers.lv0;

import java.util.Scanner;

public class P_19_0914 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int answer = 0;

        if (number % n ==0){
            if (number % m ==0){
                answer = 1;
            }
            else {
                answer = 0;
            }
        }
        else {
            answer =0;
        }

        System.out.println(answer);
    }
}
