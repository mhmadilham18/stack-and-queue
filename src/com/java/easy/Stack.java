package com.java.easy;

public class Stack {
    private Node head = null; // Menyimpan referensi ke simpul paling atas pada stack

    // Push: Menambahkan elemen ke dalam stack
    public void push(char value) {
        // **Hint**: Buat simpul baru dengan nilai 'value' dan referensi ke simpul yang ada sekarang (head)
        // Membuat node baru dan mengarahkan ke head lama
        // Set head untuk menunjuk ke node baru (elemen baru berada di atas stack)
    }

    // Pop: Mengambil elemen dari stack
    public Character pop() {
        // **Hint**: Periksa apakah stack kosong (head == null)
        // **Hint**: Jika stack kosong, kembalikan null

        // Ambil nilai dari node teratas (head)
        char value = head.getValue(); // Menyimpan nilai dari node teratas

        // **Hint**: Set head untuk menunjuk ke simpul berikutnya (node yang ada setelah head)
       // Menetapkan node berikutnya menjadi node yang baru berada di atas stack

        return value; // Kembalikan nilai yang telah diambil
    }

    // Print: Menampilkan seluruh elemen stack
    public void printStack() {
        Node current = head; // Menyimpan referensi ke simpul pertama (head)
        System.out.print("List Stack:"); // Menampilkan awal dari list
        // **Hint**: Gunakan perulangan untuk menelusuri dan mencetak nilai setiap node dalam stack
        System.out.println("null"); // Menampilkan akhir dari list
    }

    // Peek: Mengambil elemen paling atas tanpa menghapusnya
    public Character peek() {
        // **Hint**: Jika stack tidak kosong, kembalikan nilai dari simpul teratas (head)
        // Jika head null, kembalikan null
    }

    // isEmpty: Mengecek apakah stack kosong
    public boolean isEmpty() {
        // **Hint**: Periksa apakah head == null untuk mengetahui apakah stack kosong
        // Mengembalikan true jika head null (stack kosong)
    }
}
