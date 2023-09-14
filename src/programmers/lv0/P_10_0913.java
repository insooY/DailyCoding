package programmers.lv0;

import java.util.Scanner;

public class P_10_0913 {//실패
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String my_string = sc.next();
        String overwrite = sc.next();
        int s = sc.nextInt();
//        int end = s + overwrite.length();
//
//        if (my_string.length() <= overwrite.length()){
//            System.out.println(my_string.substring(0,s) + overwrite);
//        }
//        else if (my_string.length() > overwrite.length()){
//            System.out.println(my_string.substring(0,s) + overwrite + my_string.substring(overwrite.length(),my_string.length()+s));
//        }
        String answer = "";
        int len01 = overwrite.length();
        int len02 = my_string.length();
        String sub1 = my_string.substring(0,s);
        String sub2 = my_string.substring((s+len01), len02);

        answer += sub1 + overwrite + sub2;

        System.out.println(answer);
    }
}
