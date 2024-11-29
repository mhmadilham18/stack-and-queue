package com.java.medium;

import com.java.easy.Stack;

public class InfixToPostfixConverter {
    // **Hint**: Pastikan Stack mendukung karakter (Character) dan bukan Integer

    // Menentukan prioritas operator
    private int precedence(char operator) {
        switch (operator) {
            case '+':
            case '-':
               // **Hint**: Operator + dan - memiliki prioritas 1
            case '*':
            case '/':
                // **Hint**: Operator * dan / memiliki prioritas 2
            default:
                // **Hint**: Jika bukan operator, kembalikan 0 (untuk karakter lainnya)
        }
    }

    // Konversi infix ke postfix
    public String convert(String expression) {
        if (expression == null || expression.isEmpty()) {
            // **Hint**: Jika ekspresi kosong atau null, kembalikan string kosong
        }

        // **Hint**: Gunakan StringBuilder untuk menampung hasil postfix

        for (int i = 0; i < expression.length(); i++) {
            // **Hint**: Ambil karakter satu per satu dari ekspresi

            if (Character.isWhitespace(ch)) {
                // **Hint**: Jika karakter adalah spasi, lewati
            }

            if (Character.isDigit(ch)) {
                // **Hint**: Jika karakter adalah angka, langsung tambahkan ke output
            } else if (ch == '(') {
                // **Hint**: Jika karakter adalah '(', push ke stack
            } else if (ch == ')') {
                // **Hint**: Jika karakter adalah ')', keluarkan operator dari stack sampai menemukan '('
                while (!stack.isEmpty() && stack.peek() != '(') {
                    // **Hint**: Ambil operator dari stack
                    if (popped != null) {
                        output.append(popped); // Tambahkan operator ke output
                    }
                }

                if (!stack.isEmpty() && stack.peek() == '(') {
                    // **Hint**: Keluarkan '(' dari stack
                }
            } else if (isOperator(ch)) {
                // **Hint**: Jika karakter adalah operator, proses operator yang ada di stack
                while (!stack.isEmpty() && precedence(ch) <= precedence(stack.peek())) {
                    //**Hint**: Keluarkan operator dengan prioritas lebih tinggi atau sama
                    if (popped != null && popped != '(') {
                        // Tambahkan operator ke output
                    }
                }
                // **Hint**: Push operator saat ini ke stack
            } else {
                // **Hint**: Jika karakter tidak valid, throw IllegalArgumentException
            }
        }

        // **Hint**: Setelah semua karakter diproses, keluarkan semua operator yang tersisa di stack
        while (!stack.isEmpty()) {
            // **Hint**: Ambil operator terakhir dari stack
            if (popped != null) {
                // Tambahkan operator ke output
            }
        }

        // **Hint**: Kembalikan hasil akhir sebagai string
    }

    // Membantu untuk memeriksa apakah karakter adalah operator
    private boolean isOperator(char ch) {
        // **Hint**: Cek apakah karakter adalah salah satu operator
    }
}
