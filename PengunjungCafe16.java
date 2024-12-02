public class PengunjungCafe16 {

    public static void tampilkanData(String... namaPengunjung) {
        System.out.println("Daftar Nama Pengunjung");
        for (String nama : namaPengunjung) {
            System.out.println("- " + nama);
        }
    }

    public static void tampilkanJumlahHarga(int... hargaItems) {
        System.out.println("Daftar Harga Items:");
        for (int harga : hargaItems) {
            System.out.println("- Rp " + harga);
        }
    }
    public static void main(String[] args) {
        tampilkanData("Ali", "Budi", "Citra");
        tampilkanJumlahHarga(15000, 20000, 22000);
    }
}