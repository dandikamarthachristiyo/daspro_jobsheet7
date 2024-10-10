import java.util.Scanner;

public class SiakadFor07 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nilai, tertinggi = 0, terendah = 100; 
        int lulus = 0, tidakLulus= 0;
         
        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();
            if (nilai >= 60 ) {
                lulus++;
            } else {
                tidakLulus++;
            }
            if (nilai > tertinggi) {
                tertinggi = nilai;
                
            } if (nilai < terendah) {
                terendah = nilai;

            }
        }
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Banyak Mahasiswa yang lulus: " + lulus);
        System.out.println("Banyak Mahasiswa yang tidak lulus: " + tidakLulus);
        
        sc.close();
    }
}