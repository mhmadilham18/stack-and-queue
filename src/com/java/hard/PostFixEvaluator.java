package com.java.hard;

public class PostFixEvaluator {
    // **Hint**: Menggunakan stack untuk menyimpan operand selama evaluasi

    // Evaluasi ekspresi postfix
    public Integer evaluate(String expression) {
        // **Hint**: Gunakan perulangan untuk memproses setiap karakter dalam ekspresi postfix
        for (char ch : expression.toCharArray()) {

            // Jika karakter adalah angka
            if (Character.isDigit(ch)) {
                // **Hint**: Ubah karakter menjadi angka dan push ke stack
                // Mengubah karakter digit menjadi integer dan menambahkannya ke stack
            }
            // Jika karakter adalah operator (+, -, *, /)
            else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                // **Hint**: Pop dua operand dari stack
                // Operand kedua
                // Operand pertama

                // **Hint**: Periksa apakah operand bernilai null, yang berarti stack kosong
                if (operand1 == null || operand2 == null) {
                    //Jika stack kosong, evaluasi gagal
                }

                // Hitung hasil berdasarkan operator
                int result;
                // **Hint**: Gunakan switch-case untuk melakukan operasi sesuai operator
                switch (ch) {
                    case '+':
                        //your code
                        break;
                    case '-':
                        //your code
                        break;
                    case '*':
                        //your code
                        break;
                    case '/':
                        // **Hint**: Cek pembagian dengan nol
                        if (operand2 == 0) return null; // Jika pembagian dengan nol, kembalikan null
                        //your code
                        break;
                    default:
                        // **Hint**: Jika operator tidak dikenal, evaluasi gagal
                }
                // **Hint**: Push hasil ke stack
                // Menyimpan hasil operasi ke dalam stack
            }
        }
        // **Hint**: Kembalikan hasil terakhir setelah evaluasi selesai
        // Mengembalikan hasil akhir yang ada di stack
    }
}
