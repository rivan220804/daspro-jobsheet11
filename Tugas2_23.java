import java.util.Scanner;
public class Tugas2_23 {

    static int[][] penjualan = new int[7][5]; 
    static String[] menu = {"Kopi Hitam", "Cappuccino", "Latte", "Teh Tarik", "Roti Bakar"};

    public static void inputPenjualan() {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Selamat datang di Program Penjualan Cafe ===");
        
        for (int i = 0; i < 7; i++) {
            System.out.println("Masukkan data penjualan untuk hari ke-" + (i + 1) + ":");
            for (int j = 0; j < 5; j++) {
                System.out.print("Menu " + menu[j] + ": ");
                penjualan[i][j] = sc.nextInt();  
            }
        }
    }

    public static void tampilkanDataPenjualan() {
        System.out.println("\nData Penjualan Selama 7 Hari:");
        System.out.println("-------------------------------------------");
        System.out.print("Hari/Menu     ");
    
        for (String m : menu) {
            System.out.print(m + "    ");
        }
        System.out.println();
        System.out.println("-------------------------------------------");

        for (int i = 0; i < 7; i++) {
            System.out.print("Hari ke-" + (i + 1) + "   ");
            for (int j = 0; j < 5; j++) {
                System.out.print(penjualan[i][j] + "       "); 
            }
            System.out.println();
        }
    }

    public static void menuTertinggi() {
        int[] totalPenjualanPerMenu = new int[5];  

       
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 5; j++) {
                totalPenjualanPerMenu[j] += penjualan[i][j]; 
            }
        }

        int menuTertinggiIndex = 0;
        for (int i = 1; i < 5; i++) {
            if (totalPenjualanPerMenu[i] > totalPenjualanPerMenu[menuTertinggiIndex]) {
                menuTertinggiIndex = i;  
            }
        }

        System.out.println("\nMenu dengan penjualan tertinggi adalah: " + menu[menuTertinggiIndex]);
    }

   
    public static void rataRataPenjualan() {
        for (int j = 0; j < 5; j++) {
            int totalPenjualan = 0;

            for (int i = 0; i < 7; i++) {
                totalPenjualan += penjualan[i][j]; 
            }

            double rataRata = totalPenjualan / 7.0;
            System.out.println("Rata-rata penjualan untuk " + menu[j] + " adalah: " + rataRata);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Selamat datang di Program Penjualan Cafe ===");
        inputPenjualan();  
        tampilkanDataPenjualan(); 
        menuTertinggi();  
        rataRataPenjualan();  
    }
}
