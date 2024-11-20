import java.util.Scanner;
public class hitungTotalHarga {
    public static int hitungTotalHarga(int[] pilihanMenu, int[] banyakItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        int totalHarga = 0;

        for (int i = 0; i < pilihanMenu.length; i++) {
            totalHarga += hargaItems[pilihanMenu[i] - 1] * banyakItem[i];
        }

        switch (kodePromo) {
            case "DISKON50":
                totalHarga *= 0.5;
                break;
            case "DISKON30":
                totalHarga *= 0.7;
                break;
            default:
                System.out.println("Kode promo tidak valid");
        }

        return totalHarga;
    }
    public static void Menu() {
        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("===========================");
        System.out.println("Silakan pilih menu yang anda inginkan.");
       }
    
       public static void main(String[] args) {
        Menu();
        Scanner sc = new Scanner(System.in);

        System.out.print("Berapa jenis menu yang ingin Anda pesan? : ");
        int jumlahMenu = sc.nextInt();

        int[] pilihanMenu = new int[jumlahMenu];
        int[] banyakItem = new int[jumlahMenu];

        for (int i = 0; i < jumlahMenu; i++) {
            System.out.print("\nMasukkan nomor menu ke-" + (i+1) + ": ");
            pilihanMenu[i] = sc.nextInt();
            System.out.print("Masukkan jumlah item untuk menu ke-" + (i+1) + ": ");
            banyakItem[i] = sc.nextInt();
        }

        System.out.print("Masukkan kode promo (jika ada): ");
        String kodePromo = sc.next();

        int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem, kodePromo);
        System.out.println("Total harga untuk pesanan anda : Rp" + totalHarga);
    }
}

