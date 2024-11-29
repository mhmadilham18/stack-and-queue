package com.kotlin.easy

class Queue {
    private var front: Node? = null
    private var rear: Node? = null

    //enqueue
    fun enqueue(value: Char) {
        val newNode = Node(value)
        if (rear == null) {
            front = newNode
            rear = newNode
        } else {
            rear?.next = newNode
            rear = newNode
        }
    }

    //dequeue
    fun dequeue(): Char? {
        if (front == null) return null
        val value = front?.value
        front = front?.next
        if (front == null) rear == null
        return value
    }

    //print
    fun printQueue() {
        var current = front
        print("List Queue :")
        while (current != null) {
            print(" ${current.value} ← ")
            current = current.next
        }
    }

    //check empty?
    fun isEmpty(): Boolean = front == null
}