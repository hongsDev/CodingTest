package org.example;

import java.util.Scanner;

public  class Main {
    public int solution(String str, char t){
        int answer = 0;

        str = str.toUpperCase();
        t = Character.toUpperCase(t);

       /* for(int i =0 ; i<str.length(); i++){
            if(str.charAt(i) == t) answer++;
        }*/

        //배열 또는 컬렉션 프레임워크만 와야함
        //문자열 쓰려면 문자배열로 만들어서 와야함(string.toCharArray())
        for(char x : str.toCharArray()){
            if(x == t) answer++;
        }


        return answer;
    }



    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);
        System.out.println(T.solution(str,c));


    }
}