import java.util.Scanner;
public class Tugas3_08 {

    public static void main(String[] args) {
        
     Scanner sc= new Scanner (System.in);

     System.out.print("Jumlah cabang kafe: ");
        int cabang = sc.nextInt();

        int totalSemuaPelanggan = 0;
        int totalSemuaItem = 0;

        System.out.println("\n=== Input Penjualan Per Cabang ===");

        for (int i = 1; i <= cabang; i++) {
            System.out.println("\n--- Cabang " + i + " ---");

            System.out.print("Jumlah pelanggan: ");
            int pelanggan = sc.nextInt();
            totalSemuaPelanggan += pelanggan;

            int totalItemCabang = 0;

            for (int j = 1; j <= pelanggan; j++) {
                System.out.print("- Pelanggan " + j + " memesan berapa item? ");
                int item = sc.nextInt();
                totalItemCabang += item;
            }

            totalSemuaItem += totalItemCabang;

            System.out.println("Cabang " + i + " :");
            System.out.println(" - Pelanggan: " + pelanggan);
            System.out.println(" - Item terjual: " + totalItemCabang);
        }

        // Ringkasan total
        System.out.println("\n=== Total Keseluruhan ===");
        System.out.println("Total pelanggan: " + totalSemuaPelanggan);
        System.out.println("Total item terjual: " + totalSemuaItem);

        sc.close();
    }
}