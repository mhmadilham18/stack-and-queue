package com.kotlin.test

import com.kotlin.easy.Queue
import com.kotlin.easy.Stack

fun main() {
    val testStack = Stack()
    testStack.push('A')
    testStack.push('B')
    testStack.printStack()

    println("\n------------------")
    val testQueue = Queue()
    testQueue.enqueue('C')
    testQueue.enqueue('D')
    testQueue.printQueue()
}