package programmers.lv0;

import java.util.Arrays;

public class P_26_0116 {
    public static void main(String[] args) {
        int[] case1 = {3,4,5,2,1};
        int an = solution(case1);
        System.out.println(an);

    }

    private static int solution(int[] num_list) {
        int answer = 0;
        int sum = 0;
        int mul = 1;
        for (int i = 0 ; i < num_list.length; i++){
            sum += num_list[i];
            mul *= num_list[i];
        }
        if (sum * sum > mul){
            answer=1;
        }
        return answer;
    }
}