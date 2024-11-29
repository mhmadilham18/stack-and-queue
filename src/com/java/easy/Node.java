package com.java.easy;

public class Node {
    private char value;   // Menyimpan nilai simpul
    private Node next;    // Menyimpan referensi ke simpul berikutnya

    // Konstruktor untuk membuat node baru dengan nilai yang diberikan
    public Node(char value) {
        this.value = value;   // Inisialisasi nilai simpul
         // **Hint**: Set referensi next ke null (karena tidak ada simpul berikutnya)
    }

    // Konstruktor untuk membuat node baru dengan nilai dan referensi simpul berikutnya
    public Node(char value, Node next) {
        // **Hint**: Set nilai simpul sesuai dengan parameter
        // **Hint**: Set referensi simpul berikutnya dengan parameter next
    }

    // Mengambil nilai simpul
    public char getValue() {
        // **Hint**: Kembalikan nilai simpul yang disimpan di dalam node
    }

    // Mengambil simpul berikutnya
    public Node getNext() {
        // **Hint**: Kembalikan referensi simpul berikutnya yang dirujuk oleh node ini
    }

    // Mengatur simpul berikutnya
    public void setNext(Node next) {
        // **Hint**: Set referensi simpul berikutnya
    }
}
