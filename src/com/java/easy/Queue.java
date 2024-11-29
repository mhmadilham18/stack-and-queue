package com.java.easy;

public class Queue {
    private Node front = null;  // Menyimpan referensi ke elemen paling depan antrian
    private Node rear = null;   // Menyimpan referensi ke elemen paling belakang antrian

    // enqueue: Menambahkan elemen ke dalam antrian
    public void enqueue(char value) {
        // **Hint**: Membuat node baru dengan nilai 'value'

        // **Hint**: Jika antrian kosong (rear == null), set front dan rear ke node baru
        if (rear == null) {
            // Menetapkan front ke node baru
            // Menetapkan rear ke node baru
        } else {
            // **Hint**: Jika antrian tidak kosong, tambahkan node baru setelah rear dan perbarui rear
            // Menetapkan next dari rear ke node baru
            // Mengatur rear untuk menunjuk ke node baru
        }
    }

    // dequeue: Mengambil elemen dari antrian
    public Character dequeue() {
        if (front == null) { // **Hint**: Periksa apakah antrian kosong (front == null)
           // Kembalikan null jika antrian kosong
        }

        // **Hint**: Ambil nilai dari elemen depan (front)

        // **Hint**: Set front untuk menunjuk ke simpul berikutnya dalam antrian
        // Mengatur front untuk menunjuk ke node berikutnya

        if (front == null) { // **Hint**: Jika front menjadi null, berarti antrian kosong, set rear ke null
            // Menetapkan rear ke null
        }

        return value; // Kembalikan nilai yang telah diambil
    }

    // printQueue: Menampilkan seluruh elemen antrian
    public void printQueue() {
        Node current = front; // Menyimpan referensi ke simpul pertama (front)
        System.out.print("List Queue: "); // Menampilkan label awal list
        // **Hint**: Gunakan perulangan untuk menelusuri dan mencetak nilai setiap node dalam antrian
        while (current != null) {
            // Menampilkan nilai dari node
            // Menyusun elemen berikutnya dalam antrian
        }
        System.out.println("null"); // Menampilkan akhir dari antrian
    }

    // Peek
    public Character peek() {
        return (front != null) ? front.getValue() : null; // Mengembalikan nilai front atau null jika queue kosong
    }

    // isEmpty: Mengecek apakah antrian kosong
    public boolean isEmpty() {
        // **Hint**: Periksa apakah front == null untuk mengetahui apakah antrian kosong
        // Mengembalikan true jika front adalah null
    }
}
