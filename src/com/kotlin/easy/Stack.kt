package com.kotlin.easy

class Stack {

    private var head: Node? = null

    //push
    fun push(value: Char) {
        val newNode = Node(value, head)
        head = newNode
    }

    //pop
    fun pop(): Char? {
        if (head == null) return null
        val value = head?.value
        head = head?.next
        return value
    }

    //print
    fun printStack() {
        var current = head
        print("List Stack :")
        while (current != null) {
            print(" ${current.value} ← ")
            current = current.next
        }
    }

    //peek
    fun peek(): Char? = head?.value

    //check empty?
    fun isEmpty(): Boolean = head == null
}