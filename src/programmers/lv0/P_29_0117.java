package programmers.lv0;

public class P_29_0117 {
    public static void main(String[] args) {
        int case1 = 0;
        String case2 = "wsdawsdassw";
        int an = solution(case1, case2);
        System.out.println(an);


    }

    private static int solution(int n, String control){
        int answer = 0;
        for (int i = 0 ; i < control.length(); i ++){
            if (control.charAt(i) == 'w'){
                answer += 1;
            } else if (control.charAt(i) == 's') {
                answer -= 1;
            } else if (control.charAt(i) == 'd') {
                answer += 10;
            } else if (control.charAt(i) == 'a') {
                answer -= 10;
            }else {
                return answer;
            }
        }

        return answer;
    }
}
