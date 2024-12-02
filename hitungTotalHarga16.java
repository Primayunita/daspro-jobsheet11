import java.util.Scanner;

public class hitungTotalHarga16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] hargaMenu = {15000, 20000, 22000, 12000, 10000, 18000};
        int totalHarga = 0;

        System.out.print("Masukkan nama pelanggan: ");
        String namaPelanggan = sc.nextLine();

        System.out.print("Apakah Anda member? (ya/tidak): ");
        boolean isMember = sc.nextLine().equalsIgnoreCase("ya");

        boolean lanjutPesan = true;
        while (lanjutPesan) {
            System.out.println("===== MENU RESTO KAFE =====");
            System.out.println("1. Kopi Hitam  - Rp 15.000");
            System.out.println("2. Cappuccino  - Rp 20.000");
            System.out.println("3. Latte       - Rp 22.000");
            System.out.println("4. Teh Tarik   - Rp 12.000");
            System.out.println("5. Roti Bakar  - Rp 10.000");
            System.out.println("6. Mie Goreng  - Rp 18.000");

            System.out.print("Pilih menu (1-6): ");
            int pilihanMenu = sc.nextInt();

            System.out.print("Jumlah item: ");
            int jumlahItem = sc.nextInt();

            totalHarga += hargaMenu[pilihanMenu - 1] * jumlahItem;

            System.out.print("Pesan lagi? (ya/tidak): ");
            sc.nextLine(); 
            lanjutPesan = sc.nextLine().equalsIgnoreCase("ya");
        }

        if (isMember) {
            totalHarga -= totalHarga * 10 / 100;
            System.out.println("Diskon 10% untuk member telah diterapkan.");
        }

        System.out.print("\nMasukkan kode promo (DISKON50 / DISKON30): ");
        String kodePromo = sc.nextLine().toUpperCase();

        if (kodePromo.equals("DISKON50")) {
            totalHarga /= 2;
            System.out.println("Diskon 50% berhasil diterapkan.");
        } else if (kodePromo.equals("DISKON30")) {
            totalHarga -= totalHarga * 30 / 100;
            System.out.println("Diskon 30% berhasil diterapkan.");
        } else {
            System.out.println("Kode promo tidak valid.");
        }

        System.out.println("\nTotal harga pesanan Anda: Rp " + totalHarga);
        System.out.println("Terima kasih, " + namaPelanggan + "!");
    }
}
