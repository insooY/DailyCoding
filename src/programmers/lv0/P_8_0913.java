package programmers.lv0;

import java.util.Scanner;

public class P_8_0913 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        for (int i=0; i<a.length(); i++){
            System.out.println(a.substring(i,i+1));
        }
    }
}
