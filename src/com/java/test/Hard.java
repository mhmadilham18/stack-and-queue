package com.java.test;

import com.java.hard.PostFixEvaluator;

public class Hard {
    public static void main(String[] args) {
        // Membuat instance dari PostFixEvaluator
        PostFixEvaluator evaluator = new PostFixEvaluator();

        // Daftar ekspresi postfix yang akan dievaluasi
        String[] postfixExpressions = {
                "523*+",          // Expected result: 25 (5 + 2 * (8 - 3))
                "328-5*4/+",      // Expected result: 6 (3 + 5 * (2 - 8) / 4)
                "9432*+-",        // Expected result: -9 (9 - (4 + 3 * 2))
                "1035+2*2/+",     // Expected result: 16 (10 + 2 * (3 + 5) / 2)
                "234*52/-+"       // Expected result: 7 (2 + 3 * 4 - 5 / 2)
        };

        // Mengonversi dan menampilkan hasil evaluasi untuk setiap ekspresi postfix
        for (String postfix : postfixExpressions) {
            Integer result = evaluator.evaluate(postfix);
            System.out.println("Postfix: " + postfix);
            System.out.println("Hasil evaluasi: " + result);
            System.out.println("----------------------------");
        }
    }
}
