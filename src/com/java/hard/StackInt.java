package com.java.hard;

public class StackInt {
    private NodeInt head = null; // **Hint**: 'head' menyimpan referensi ke node teratas pada stack

    // Push: Menambahkan elemen ke dalam stack
    public void push(int value) {
        // **Hint**: Buat node baru dengan nilai 'value' dan referensi ke node yang ada sekarang (head)
        // Membuat node baru dan mengarahkan ke head lama
        // Set head untuk menunjuk ke node baru
    }

    // Pop: Mengambil elemen dari stack
    public Integer pop() {
        // **Hint**: Periksa apakah stack kosong (head == null)
        // **Hint**: Jika stack kosong, kembalikan null

        // Ambil nilai dari node teratas (head)
        int value = head.getValue(); // **Hint**: Menyimpan nilai dari node teratas

        // **Hint**: Set head untuk menunjuk ke simpul berikutnya
        // Menetapkan node berikutnya menjadi node yang baru berada di atas stack

        return value; // Kembalikan nilai yang telah di-pop
    }

    // Peek: Mengambil elemen paling atas tanpa menghapusnya
    public Integer peek() {
        // **Hint**: Jika stack tidak kosong, kembalikan nilai dari simpul teratas (head)
        // Jika head null, kembalikan null
    }

    // isEmpty: Mengecek apakah stack kosong
    public boolean isEmpty() {
        // **Hint**: Periksa apakah head == null untuk mengetahui apakah stack kosong
        // Mengembalikan true jika head null (stack kosong)
    }
}
