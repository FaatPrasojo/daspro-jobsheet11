import java.util.Scanner;
public class Kubus08 {
    static int hitungLuasPermukaan(int sisi){
        int LuasPermukaan = 6 * (sisi*sisi);
        return LuasPermukaan;
    }
    static int hitungVolume (int a){
        int volume = a*a*a;
        return volume;
    }
    public static void main(String[] args) {
        Scanner pras = new Scanner(System.in);
        int s,LPermukaan, vol;

        System.out.print("Masukkan panjang sisi : ");
        s = pras.nextInt();
        

        LPermukaan = hitungLuasPermukaan(s);
        System.out.println("luas permukaan kubus adalah " + LPermukaan);

        vol = hitungVolume(s);
        System.out.println("Volume balok adalah : " + vol);
    }
}
