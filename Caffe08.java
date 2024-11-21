import java.util.Scanner;

public class Caffe08 {
    static int[][] penjualan = new int[7][5]; 
    public static void Menu() {
        System.out.println("======== MENU KAFE ========");
        System.out.println("1. Kopi ");
        System.out.println("2. Teh ");
        System.out.println("3. Es Degan ");
        System.out.println("4. Roti Bakar ");
        System.out.println("5. Gorengan");
        System.out.println("============================");
       }
    
    public static void inputData() {
        Scanner pras = new Scanner(System.in);

        for (int i = 0; i < 7; i++) {
            System.out.println("Masukkan data penjualan hari ke-" + (i + 1));
            for (int j = 0; j < 5; j++) {
                System.out.print("Menu " + (j + 1) + ": ");
                penjualan[i][j] = pras.nextInt();
            }
        }
    }

    public static void tampilkanSemuaData() {
        System.out.println("Data Penjualan Caffe:");
        for (int i = 0; i < 7; i++) {
            System.out.print("Hari ke-" + (i + 1) + ": ");
            for (int j = 0; j < 5; j++) {
                System.out.print(penjualan[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void menuTerlaris() {
        int[] totalPenjualanMenu = new int[5];
        int menuTerlaris = 0;
        int maxPenjualan = 0;

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 5; j++) {
                totalPenjualanMenu[j] += penjualan[i][j];
                if (totalPenjualanMenu[j] > maxPenjualan) {
                    maxPenjualan = totalPenjualanMenu[j];
                    menuTerlaris = j;
                }
            }
        }

        System.out.println("Menu terlaris adalah menu " + (menuTerlaris + 1) + " dengan total penjualan " + maxPenjualan);
    }

    public static void rataRataPenjualanPerMenu() {
        int[] totalPenjualanMenu = new int[5];

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 5; j++) {
                totalPenjualanMenu[j] += penjualan[i][j];
            }
        }

        System.out.println("Rata-rata penjualan per menu:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Menu " + (i + 1) + ": " + (float) totalPenjualanMenu[i] / 7);
        }
    }

    public static void main(String[] args) {
        Menu();
        inputData();
        tampilkanSemuaData();
        menuTerlaris();
        rataRataPenjualanPerMenu();
    }
}