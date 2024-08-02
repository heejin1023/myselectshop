package com.sparta.myselectshop;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MyselectshopApplicationTests {

    @Test
    void contextLoads() {
        int x = 4;
        int n = 3;
        long[] answer = new long[n];

        for(int i = 0; i < answer.length; i++) {
            if(i == 0) {
                answer[i] = x;
                continue;
            }

            answer[i] = answer[i - 1] + x;
            System.out.println(i + " " + answer[i]);
        }
        System.out.println("----");
        for(int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
    }

}
