package programmers.lv0;

import java.util.Scanner;

public class P_20_0914 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = 0;

        if(n % 2 ==0){
            for(int i = 2; i < n+1; i +=2){
                answer += i*i;
            }
        }
        else{
            for(int i = 1; i < n+1; i+=2){
                answer += i;
            }
        }

        System.out.println(answer);

    }
}
