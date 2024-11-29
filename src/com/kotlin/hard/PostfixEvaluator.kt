package com.kotlin.hard

class PostfixEvaluator {
    private val stack = StackInt() // Stack sekarang mendukung Int

    // Evaluasi ekspresi postfix
    fun evaluate(expression: String): Int? {
        for (char in expression) {
            when {
                char.isDigit() -> {
                    stack.push(char.toString().toInt()) // Ubah char ke angka dan simpan
                }
                char in listOf('+', '-', '*', '/') -> {
                    val operand2 = stack.pop() ?: return null // Operand kedua
                    val operand1 = stack.pop() ?: return null // Operand pertama

                    // Hitung hasil
                    val result = when (char) {
                        '+' -> operand1 + operand2
                        '-' -> operand1 - operand2
                        '*' -> operand1 * operand2
                        '/' -> if (operand2 != 0) operand1 / operand2 else return null // Cek pembagian nol
                        else -> return null
                    }
                    stack.push(result) // Simpan hasil sebagai Int
                }
            }
        }
        return stack.pop() // Kembalikan hasil sebagai Int
    }
}
