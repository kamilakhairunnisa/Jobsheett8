import java.util.Scanner;
public class Tugas2_8 {

    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);

         System.out.print("Masukkan nilai N : ");
        int N = sc.nextInt();

        // Baris atas
        for (int i = 1; i <= N; i++) {
            System.out.print(N + " ");
        }
        System.out.println();

        // Bagian tengah
        for (int i = 1; i <= N - 2; i++) {
            System.out.print(N + " ");  // sisi kiri
            for (int j = 1; j <= N - 2; j++) {
                System.out.print("  ");  //  spasi tengah
            }
            System.out.println(N + " ");  // sisi kanan
        }

        // Baris bawah
        for (int i = 1; i <= N; i++) {
            System.out.print(N + " ");
        }

        System.out.println();
        sc.close();
    }
}