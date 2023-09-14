package programmers.lv0;

import java.util.Scanner;

public class P_15_0914 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String my_string = sc.next();
        int k = sc.nextInt();
        String answer = "";

        for (int i = 0 ; i < k ; i ++){
            answer += my_string;
        }

        System.out.println(answer);
    }
}
