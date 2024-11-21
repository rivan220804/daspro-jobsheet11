import java.util.Scanner;
public class Pengunjungcafe23 {
    public static void main(String[] args) {
       
        daftarPengunjung("Ali", "Budi", "Citra");  
        daftarPengunjung(new String[] {"Ali", "Budi", "Citra"}, new int[] {25, 30, 22}); 
    }

    public static void daftarPengunjung(String... namaPengunjung) {
        System.out.println("Daftar Nama Pengunjung:");
        for (String pengunjung : namaPengunjung) {
            System.out.println("- " + pengunjung);
        }
    }

    public static void daftarPengunjung(String[] namaPengunjung, int[] usiaPengunjung) {
        System.out.println("Daftar Nama dan Usia Pengunjung:");
        for (int i = 0; i < namaPengunjung.length; i++) {
            System.out.println(namaPengunjung[i] + " - Usia: " + usiaPengunjung[i]);
        }
    }
}

