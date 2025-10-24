import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double angka1, angka2, hasil;
        char operator;

        System.out.println("=== Kalkulator  (Tambah & Kurang) ===");

        // Meminta input angka pertama
        System.out.print("Masukkan angka pertama: ");
        angka1 = input.nextDouble();

        // Meminta input operator
        System.out.print("Pilih operasi (+ atau -): ");
        operator = input.next().charAt(0);

        // Meminta input angka kedua
        System.out.print("Masukkan angka kedua: ");
        angka2 = input.nextDouble();

        // Melakukan perhitungan berdasarkan operator
        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                System.out.println("\nHasil Penambahan: " + angka1 + " + " + angka2 + " = " + hasil);
                break;
            case '-':
                hasil = angka1 - angka2;
                System.out.println("\nHasil Pengurangan: " + angka1 + " - " + angka2 + " = " + hasil);
                break;
            default:
                System.out.println("\nOperator yang dimasukkan tidak valid. Hanya menerima '+' atau '-'.");
                return; // Keluar dari program
        }

        input.close();
    }
}