package programmers.lv0;

public class P_27_0116 {
    public static void main(String[] args) {
        int [] case1 = {3,4,5,2,1};
        int an = solution(case1);
        System.out.println(an);

    }

    private static int solution(int[] num_list){
        int answer = 0;
        String even = "";//짝수
        String odd = "";//홀수

        for (int i = 0; i < num_list.length; i++){
            if (num_list[i] % 2 == 0){
                even += Integer.toString(num_list[i]);
            } else {
                odd += Integer.toString(num_list[i]);
            }
        }

        answer = Integer.parseInt(even) + Integer.parseInt(odd);
        return answer;
    }
}
