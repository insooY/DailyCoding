package programmers.lv0;

import java.util.Scanner;

public class P_22_0914 {
    public static void main(String[] args) {//flag = false 일 때 값이 이상함....
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean flag = sc.hasNext();
        int answer = 0;
        if (flag == true){
            answer = a+b;
        }
        else if (flag == false){
            answer = a-b;
        }

        System.out.println(answer);
    }
}
