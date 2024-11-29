package com.kotlin.medium

import com.kotlin.easy.Stack

class InfixToPostfixConverter {
    private val stack = Stack() // Menggunakan Stack dari package com.kotlin.easy

    // Menentukan prioritas operator
    private fun precedence(operator: Char): Int {
        return when (operator) {
            '+', '-' -> 1
            '*', '/' -> 2
            else -> 0
        }
    }

    // Konversi dari infix ke postfix
    fun convert(expression: String): String {
        if (expression.isEmpty()) return ""

        val output = StringBuilder()

        for (char in expression) {
            when {
                char.isDigit() -> {
                    output.append(char) // Angka langsung ditambahkan ke output
                }
                char == '(' -> {
                    stack.push(char) // Simpan '(' ke stack
                }
                char == ')' -> {
                    while (!stack.isEmpty() && stack.peek() != '(') {
                        output.append(stack.pop())
                    }
                    stack.pop() // Hapus '(' dari stack
                }
                char in listOf('+', '-', '*', '/') -> {
                    while (!stack.isEmpty() && precedence(char) <= precedence(stack.peek() ?: ' ')) {
                        output.append(stack.pop())
                    }
                    stack.push(char) // Simpan operator ke stack
                }
                else -> {
                    throw IllegalArgumentException("Invalid character in expression: $char")
                }
            }
        }

        // Kosongkan sisa stack ke output
        while (!stack.isEmpty()) {
            output.append(stack.pop())
        }

        return output.toString()
    }
}
