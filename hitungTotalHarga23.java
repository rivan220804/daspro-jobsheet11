import java.lang.classfile.instruction.StoreInstruction;
import java.util.Scanner;
public class hitungTotalHarga23 {
    
    public static void Menu() {
       
        System.out.println("==== MENU RESTO KAFE ====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappucino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("=========================");
        System.out.println("Silakan pilih menu yang anda inginkan.");
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double totalHargaKeseluruhan = 0;
    
    while (true) {
        Menu();
        System.out.println("\nMasukkan nomor menu yang ingin anda pesan: ");
        int pilihanMenu = sc.nextInt();
        System.out.println("Masukkan jumlah item yang ingin dipesan: ");
        int banyakItem = sc.nextInt();
        
        sc.nextLine(); 

        System.out.println("Masukkan kode promo (kosongkan jika tidak ada): ");
        String kodePromo = sc.nextLine();
        double hargaItem = hitungTotalHarga(pilihanMenu, banyakItem, kodePromo);
        totalHargaKeseluruhan += hargaItem;

        System.out.println("Total harga untuk item ini: Rp " + hargaItem);
        
        System.out.println("Apakah Anda ingin menambah pesanan lagi? (ya/tidak): ");
        String lanjutkan = sc.nextLine();
        
        if (lanjutkan.equalsIgnoreCase("tidak")) {
            break; 
        }
    }
    
    System.out.println("\nTotal keseluruhan harga pesanan Anda: Rp " + totalHargaKeseluruhan);
}

public static double hitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo) {
    double[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
    
    double hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
    
    if (kodePromo.equals("DISKON50%")) {
        hargaTotal = hargaTotal * 0.5; 
        System.out.println("DISKON 50% digunakan.");     
    } else if (kodePromo.equals("DISKON30%")) {
        hargaTotal = hargaTotal * 0.7;
        System.out.println("DISKON 30% digunakan.");
    } else {
        System.out.println("Kode promo invalid.");
    }
    
    return hargaTotal;
}
}