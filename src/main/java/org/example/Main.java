package org.example;

import java.io.IOException;

// GET : calculate가 들어요면 /calculate?operand1=11&oprator=*&operand2=55 을 보내 결과를 출력하게 만들거임
public class Main {
    public static void main(String[] args) throws IOException {

        new CustomWebApplicationServer( 8080 ).start();
        System.out.println("Aa");

    }
}