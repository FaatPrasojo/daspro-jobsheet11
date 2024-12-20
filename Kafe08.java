public class Kafe08 {
   public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
    System.out.println("Selamat datang, " + namaPelanggan + "!");

    if (isMember) {
        System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
    }

    System.out.println("===== MENU RESTO KAFE =====");
    System.out.println("1. Kopi Hitam - Rp 15,000");
    System.out.println("2. Cappuccino - Rp 20,000");
    System.out.println("3. Latte - Rp 22,000");
    System.out.println("4. Teh Tarik - Rp 12,000");
    System.out.println("5. Roti Bakar - Rp 10,000");
    System.out.println("6. Mie Goreng - Rp 18,000");
    System.out.println("===========================");
    System.out.println("Silakan pilih menu yang anda inginkan.");
   
        switch (kodePromo) {
            case "DISKON50":
                System.out.println("Anda mendapatkan diskon 50%");
                break;
            case "DISKON30":
                System.out.println("Anda mendapatkan diskon 30%");
                break;
            default:
                System.out.println("Kode promo tidak valid");
        }
   }
    public static void main(String[] args) {
        Menu("Andi", true, "DISKON50");
    }
}