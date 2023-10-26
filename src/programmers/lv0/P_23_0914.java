package programmers.lv0;

public class P_23_0914 {//코드 처리하기 실패...

    public static void main(String[] args) {
        String code = "abc1abc1abc";
        String an = soulution(code);
        System.out.println(an);
    }

    private static String soulution(String code) {
        String answer = "";
        int mode = 0;
        for(int idx = 0 ; idx < code.length(); idx ++){
            if(code.charAt(idx) == '1' && mode == 0){
                mode = 1;
            }
            else if(code.charAt(idx) == '1' && mode == 1){
                mode = 0;
            }

            if(mode == 0){
                if(code.charAt(idx) != '1' && idx % 2 == 0){
                    answer += code.charAt(idx);
                }
            }
            else if (mode == 1){
                if(code.charAt(idx) != '1' && idx % 2 != 0){
                    answer += code.charAt(idx);
                }
            }


        }
        if(answer.isEmpty()){
            return "EMPTY";
        }

        return answer;
    }

}
