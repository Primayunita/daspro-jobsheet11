import java.util.Scanner;

public class Tugas3 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = scanner.nextInt();

        System.out.print("Masukkan jumlah tugas: ");
        int jumlahTugas = scanner.nextInt();

        int[][] nilaiTugas = new int[jumlahMahasiswa][jumlahTugas];

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("\nMasukkan nilai tugas untuk Mahasiswa " + (i + 1) + ":");
            for (int j = 0; j < jumlahTugas; j++) {
                System.out.print("Tugas " + (j + 1) + ": ");
                nilaiTugas[i][j] = scanner.nextInt();
            }
        }

        int pilihan;
        while (true) {
            System.out.println("\n1. Tampilkan seluruh nilai tugas");
            System.out.println("2. Mahasiswa dengan nilai tugas tertinggi");
            System.out.println("3. Rata-rata nilai tugas per mahasiswa");
            System.out.println("4. Keluar");
            System.out.print("Pilih: ");
            pilihan = scanner.nextInt();

            if (pilihan == 1) {
                for (int i = 0; i < jumlahMahasiswa; i++) {
                    System.out.print("Mahasiswa " + (i + 1) + ": ");
                    for (int j = 0; j < jumlahTugas; j++) {
                        System.out.print(nilaiTugas[i][j] + " ");
                    }
                    System.out.println();
                }
            } else if (pilihan == 2) {
                int maxNilai = 0;
                int mahasiswaTertinggi = 0;
                for (int i = 0; i < jumlahMahasiswa; i++) {
                    int totalNilai = 0;
                    for (int j = 0; j < jumlahTugas; j++) {
                        totalNilai += nilaiTugas[i][j];
                    }
                    if (totalNilai > maxNilai) {
                        maxNilai = totalNilai;
                        mahasiswaTertinggi = i + 1;
                    }
                }
                System.out.println("Mahasiswa dengan nilai tertinggi adalah Mahasiswa " + mahasiswaTertinggi + " dengan total nilai " + maxNilai);
            } else if (pilihan == 3) {
                for (int i = 0; i < jumlahMahasiswa; i++) {
                    int totalNilai = 0;
                    for (int j = 0; j < jumlahTugas; j++) {
                        totalNilai += nilaiTugas[i][j];
                    }
                    double rataRata = (double) totalNilai / jumlahTugas;
                    System.out.println("Rata-rata nilai Mahasiswa " + (i + 1) + ": " + rataRata);
                }
            } else if (pilihan == 4) {
                break;
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        }
    }
}