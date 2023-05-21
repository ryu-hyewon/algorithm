package algorithm.section01;

import java.util.Scanner;

public class Problem01 {

    public int solution(String str, char c) {
        int answer = 0;
        str = str.toUpperCase();
        c = Character.toUpperCase(c);

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == c) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Problem01 p = new Problem01();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);

        System.out.print(p.solution(str, c));
    }
}
