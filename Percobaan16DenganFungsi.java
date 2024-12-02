import java.util.Scanner;

public class Percobaan16DenganFungsi {

    static int hitungLuas(int p, int l) {
        int luas = p * l;
        return luas;
    }

    static int hitungVolume(int t, int p, int l) {
        int volume = hitungLuas(p, l) * t;
        return volume;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int p, l, t, L, vol;

        System.out.println("Masukkan panjang:");
        p = input.nextInt();
        System.out.println("Masukkan lebar:");
        l = input.nextInt();
        System.out.println("Masukkan tinggi:");
        t = input.nextInt();

        L = hitungLuas(p, l);
        vol = hitungVolume(t, p, l);

        System.out.println("Luas Persegi Panjang adalah " + L);
        System.out.println("Volume Balok adalah " + vol);
    }
}