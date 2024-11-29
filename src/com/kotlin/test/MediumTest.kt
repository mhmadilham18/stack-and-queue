package com.kotlin.test

import com.kotlin.medium.InfixToPostfixConverter

fun main() {
    val converter = InfixToPostfixConverter()
    val infixPertama = "4*2*(2-9)"
    val infixKedua = "2+2/2*3"
    println("Postfix: ${converter.convert(infixPertama)}")
    println("Postfix: ${converter.convert(infixKedua)}")
}