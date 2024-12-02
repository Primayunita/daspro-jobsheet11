import java.util.Scanner;

public class Tugas2 {
    static int[][] penjualan = {
        {20, 20, 25, 20, 10, 60, 10}, // Kopi
        {30, 80, 40, 10, 15, 20, 25}, // Teh
        {5, 9, 20, 25, 30, 5, 45},    // Es Degan
        {50, 8, 17, 18, 23, 12, 30},  // Roti Bakar
        {15, 10, 16, 15, 10, 10, 55}  // Gorengan
    };
    static String[] menu = {"Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;
        
        while (true) {
            System.out.println("\n1. Tampilkan seluruh penjualan");
            System.out.println("2. Menu dengan penjualan tertinggi");
            System.out.println("3. Rata-rata penjualan per menu");
            System.out.println("4. Keluar");
            System.out.print("Pilih: ");
            pilihan = scanner.nextInt();
            
            if (pilihan == 1) {
                for (int i = 0; i < penjualan.length; i++) {
                    System.out.print(menu[i] + ": ");
                    for (int j : penjualan[i]) System.out.print(j + " ");
                    System.out.println();
                }
            } else if (pilihan == 2) {
                int maxPenjualan = 0;
                String menuTertinggi = "";
                for (int i = 0; i < penjualan.length; i++) {
                    int total = 0;
                    for (int j : penjualan[i]) total += j;
                    if (total > maxPenjualan) {
                        maxPenjualan = total;
                        menuTertinggi = menu[i];
                    }
                }
                System.out.println("Menu tertinggi: " + menuTertinggi + " - " + maxPenjualan);
            } else if (pilihan == 3) {
                for (int i = 0; i < penjualan.length; i++) {
                    int total = 0;
                    for (int j : penjualan[i]) total += j;
                    System.out.println("Rata-rata " + menu[i] + ": " + (double) total / penjualan[i].length);
                }
            } else if (pilihan == 4) {
                break;
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        }
    }
}