package com.kotlin.test

import com.kotlin.hard.PostfixEvaluator

fun main() {
    val evaluator = PostfixEvaluator()
    val postfix = "222/3*+"
    val result = evaluator.evaluate(postfix)
    println("Hasil evaluasi: $result")
}