import java.util.Scanner;
public class Tugas3_23 {

    static int[][] penjualan;  
    static String[] menu = {"Kopi Hitam", "Cappuccino", "Latte", "Teh Tarik", "Roti Bakar"};

    public static void inputPenjualan(int jumlahHari, int jumlahMenu) {
        Scanner sc = new Scanner(System.in);

        penjualan = new int[jumlahHari][jumlahMenu]; 

        System.out.println("=== Selamat datang di Program Penjualan Cafe ===");

        for (int i = 0; i < jumlahHari; i++) {
            System.out.println("Masukkan data penjualan untuk hari ke-" + (i + 1) + ":");
            for (int j = 0; j < jumlahMenu; j++) {
                System.out.print("Menu " + menu[j] + ": ");
                penjualan[i][j] = sc.nextInt(); 
            }
        }
    }

    public static void tampilkanDataPenjualan(int jumlahHari, int jumlahMenu) {
        System.out.println("\nData Penjualan Selama " + jumlahHari + " Hari:");
        System.out.println("-------------------------------------------");
        System.out.print("Hari/Menu     ");
    
        for (String m : menu) {
            System.out.print(m + "    ");
        }
        System.out.println();
        System.out.println("-------------------------------------------");

        for (int i = 0; i < jumlahHari; i++) {
            System.out.print("Hari ke-" + (i + 1) + "   ");
            for (int j = 0; j < jumlahMenu; j++) {
                System.out.print(penjualan[i][j] + "       "); 
            }
            System.out.println();
        }
    }

    public static void menuTertinggi(int jumlahHari, int jumlahMenu) {
        int[] totalPenjualanPerMenu = new int[jumlahMenu]; 

        for (int i = 0; i < jumlahHari; i++) {
            for (int j = 0; j < jumlahMenu; j++) {
                totalPenjualanPerMenu[j] += penjualan[i][j]; 
            }
        }

        int menuTertinggiIndex = 0;
        for (int i = 1; i < jumlahMenu; i++) {
            if (totalPenjualanPerMenu[i] > totalPenjualanPerMenu[menuTertinggiIndex]) {
            }
        }

        System.out.println("\nMenu dengan penjualan tertinggi adalah: " + menu[menuTertinggiIndex]);
    }
    public static void rataRataPenjualan(int jumlahHari, int jumlahMenu) {
        for (int j = 0; j < jumlahMenu; j++) {
            int totalPenjualan = 0;

            for (int i = 0; i < jumlahHari; i++) {
                totalPenjualan += penjualan[i][j];  
            }

            double rataRata = totalPenjualan / (double) jumlahHari; 
            System.out.println("Rata-rata penjualan untuk " + menu[j] + " adalah: " + rataRata);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah hari: ");
        int jumlahHari = sc.nextInt();

        System.out.print("Masukkan jumlah menu: ");
        int jumlahMenu = sc.nextInt();

        inputPenjualan(jumlahHari, jumlahMenu);
        tampilkanDataPenjualan(jumlahHari, jumlahMenu);
        menuTertinggi(jumlahHari, jumlahMenu);
        rataRataPenjualan(jumlahHari, jumlahMenu);
    }
}
