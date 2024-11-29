package com.kotlin.hard

class StackInt {
    private var head: NodeInt? = null

    // Menambahkan elemen ke stack
    fun push(value: Int) {
        val newNode = NodeInt(value, head)
        head = newNode
    }

    // Menghapus elemen dari stack dan mengembalikan nilainya
    fun pop(): Int? {
        if (head == null) return null
        val value = head?.value
        head = head?.next
        return value
    }

    // Melihat elemen di atas stack tanpa menghapusnya
    fun peek(): Int? = head?.value

    // Mengecek apakah stack kosong
    fun isEmpty(): Boolean = head == null
}