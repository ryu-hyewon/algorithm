package algorithm.section01;

import java.util.Scanner;

public class Problem02 {

    public String solution(String str) {
        String answer = "";
        for(char c : str.toCharArray()) {
            if(Character.isLowerCase(c))    answer += Character.toUpperCase(c);
            else answer += Character.toLowerCase(c);
        }
        return answer;
    }

    public static void main(String[] args) {
        Problem02 p = new Problem02();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(p.solution(str));
    }
}
