package programmers.lv0;

import java.util.Scanner;

public class P_12_0914 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[]{sc.next()};

        String answer = "";

        for (int i = 0 ; i < arr.length ; i ++){
            answer += arr[i];
        }

        System.out.println(answer);
    }
}
