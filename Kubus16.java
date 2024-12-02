import java.util.Scanner;

public class Kubus16 {

    public static int hitungVolume(int sisi) {
        return sisi * sisi * sisi;
    }

    public static int hitungLuasPermukaan(int sisi) {
        return 6 * sisi * sisi;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi kubus: ");
        int sisiKubus = scanner.nextInt();

        int volume = hitungVolume(sisiKubus);
        System.out.println("Volume kubus dengan sisi " + sisiKubus + " adalah: " + volume);

        int luasPermukaan = hitungLuasPermukaan(sisiKubus);
        System.out.println("Luas permukaan kubus dengan sisi " + sisiKubus + " adalah: " + luasPermukaan);
        
    }
}