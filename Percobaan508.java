import java.util.Scanner;
public class Percobaan508 {
    static int hitungLuas(int pjg, int lb){
        int Luas = pjg * lb;
        return Luas;
    }
    static int hitungVolume (int tinggi, int a, int b){
        int volume = hitungLuas(a, b)*tinggi;
        return volume;
    }
    public static void main(String[] args) {
        Scanner pras = new Scanner(System.in);
        int p,l,t,L,vol;

        System.out.print("Masukkan panjang : ");
        p = pras.nextInt();
        System.out.print("Masukkan lebar : ");
        l = pras.nextInt();
        System.out.print("Masukkan tinggi : ");
        t = pras.nextInt();

        L = hitungLuas(p, l);
        System.out.println("luas persegi panjang adalah " + L);

        vol = hitungVolume(t, p, l);
        System.out.println("Volume balok adalah : " + vol);
    }
}
