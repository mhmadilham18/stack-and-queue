package com.java.hard;

public class NodeInt {
   // **Hint**: Nilai yang disimpan dalam node ini, yang bertipe int
   // **Hint**: Referensi ke node berikutnya, null jika tidak ada node setelahnya

    // Constructor untuk node tanpa referensi ke node berikutnya
    public NodeInt(int value) {
        // **Hint**: Inisialisasi nilai node dengan 'value'
        // **Hint**: Set 'next' ke null, karena node ini belum memiliki node berikutnya
    }

    // Constructor untuk node dengan referensi ke node berikutnya
    public NodeInt(int value, NodeInt next) {
        // **Hint**: Inisialisasi nilai node dengan 'value'
        // **Hint**: Mengatur 'next' dengan referensi ke node berikutnya
    }

    // Getter untuk mendapatkan nilai node
    public int getValue() {
        // **Hint**: Mengembalikan nilai yang disimpan dalam node
    }

    // Getter untuk mendapatkan referensi ke node berikutnya
    public NodeInt getNext() {
        // **Hint**: Mengembalikan referensi ke node berikutnya
    }

    // Setter untuk mengatur referensi ke node berikutnya
    public void setNext(NodeInt next) {
        // **Hint**: Mengatur referensi 'next' ke node baru
    }
}
