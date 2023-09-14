package programmers.lv0;

import java.util.Scanner;

public class P_21_0914 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ineq = sc.next();
        String eq = sc.next();
        int n = sc.nextInt();
        int m = sc.nextInt();

        int answer = 0;
        if (ineq.equals(">")){
            if (eq.equals("=")){
                answer = n >= m ? 1 : 0;
            } else if (eq.equals("!")) {
                answer = n > m ? 1 : 0;
            }
        } else if (ineq.equals("<")) {
            if (eq.equals("=")){
                answer = n <= m ? 1 : 0;
            } else if (eq.equals("!")) {
                answer = n < m ? 1 : 0;
            }
        }
        System.out.println(answer);


    }
}
