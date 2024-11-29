package com.java.test;

import com.java.medium.InfixToPostfixConverter;

public class Medium {
    public static void main(String[] args) {
        // Membuat instance dari InfixToPostfixConverter
        InfixToPostfixConverter converter = new InfixToPostfixConverter();

        // Daftar ekspresi infix yang akan dikonversi
        String[] infixExpressions = {
                "5+2*(8-3)",       // Expected Output: 523*+
                "3+5*(2-8)/4",     // Expected Output: 328-5*4/+
                "9-(4+3*2)",       // Expected Output: 9432*+-
                "10+2*(3+5)/2",    // Expected Output: 1035+2*2/+
                "2+3*4-5/2"        // Expected Output: 234*52/-+
        };

        // Mengonversi dan menampilkan hasil untuk setiap ekspresi
        for (String infix : infixExpressions) {
            String postfix = converter.convert(infix);
            System.out.println("Infix: " + infix);
            System.out.println("Postfix: " + postfix);
            System.out.println("----------------------------");
        }
    }
}
