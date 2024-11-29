package com.java.test;

import com.java.easy.Queue;
import com.java.easy.Stack;

public class Easy {
    public static void main(String[] args) {
        // Uji Stack
        Stack testStack = new Stack();
        System.out.println("Uji Stack:");

        // Push 'A' dan 'B'
        testStack.push('A');
        testStack.push('B');
        System.out.println("Stack setelah push 'A' dan 'B':");
        testStack.printStack();
        // Output yang diharapkan: 'B ← A ← null' karena B adalah yang paling atas

        // Peek (harus mengembalikan B)
        System.out.println("Peek stack: " + testStack.peek());
        // Output yang diharapkan: B

        // Pop (harus menghapus B dan mengembalikan nilainya)
        System.out.println("Pop stack: " + testStack.pop());
        // Output yang diharapkan: B

        // Stack setelah pop
        System.out.println("Stack setelah pop:");
        testStack.printStack();
        // Output yang diharapkan: 'A ← null' karena B sudah di-pop

        // Cek apakah stack kosong (harus false karena A masih ada)
        System.out.println("Is stack empty? " + testStack.isEmpty());
        // Output yang diharapkan: false

        // Pop A (stack harus kosong setelah ini)
        testStack.pop();
        System.out.println("Stack setelah pop 'A':");
        testStack.printStack();
        // Output yang diharapkan: 'null' karena stack kosong

        // Cek apakah stack kosong (harus true sekarang)
        System.out.println("Is stack empty? " + testStack.isEmpty());
        // Output yang diharapkan: true

        System.out.println("\n------------------");

        // Uji Queue
        Queue testQueue = new Queue();
        System.out.println("Uji Queue:");

        // Enqueue 'C' dan 'D'
        testQueue.enqueue('C');
        testQueue.enqueue('D');
        System.out.println("Queue setelah enqueue 'C' dan 'D':");
        testQueue.printQueue();
        // Output yang diharapkan: 'C → D → null' karena C adalah elemen pertama yang masuk

        // Peek (harus mengembalikan C)
        System.out.println("Peek queue: " + testQueue.peek());
        // Output yang diharapkan: C

        // Dequeue (harus menghapus C dan mengembalikan nilainya)
        System.out.println("Dequeue queue: " + testQueue.dequeue());
        // Output yang diharapkan: C

        // Queue setelah dequeue
        System.out.println("Queue setelah dequeue:");
        testQueue.printQueue();
        // Output yang diharapkan: 'D → null' karena C sudah dikeluarkan

        // Cek apakah queue kosong (harus false karena D masih ada)
        System.out.println("Is queue empty? " + testQueue.isEmpty());
        // Output yang diharapkan: false

        // Dequeue D (queue harus kosong setelah ini)
        testQueue.dequeue();
        System.out.println("Queue setelah dequeue 'D':");
        testQueue.printQueue();
        // Output yang diharapkan: 'null' karena queue kosong

        // Cek apakah queue kosong (harus true sekarang)
        System.out.println("Is queue empty? " + testQueue.isEmpty());
        // Output yang diharapkan: true
    }
}
