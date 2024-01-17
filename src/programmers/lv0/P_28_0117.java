package programmers.lv0;

import java.util.ArrayList;
import java.util.List;

public class P_28_0117 {

    public static void main(String[] args) {
        int [] case1= {2,1,6};
        List<Integer> an = solution(case1);
        System.out.println(an);

    }

    private static List<Integer> solution(int[] num_list){
        List<Integer> answer = new ArrayList<>();

        for (int i = 0 ; i < num_list.length; i ++){
            answer.add(num_list[i]);
        }

        if (num_list[num_list.length-1] > num_list[num_list.length - 2]){//마지막 원소가 클때
            answer.add(num_list[num_list.length - 1] - num_list[num_list.length - 2]);
        }else {
            answer.add(num_list[num_list.length - 1]*2);
        }
        return answer;
    }
}
