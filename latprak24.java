
package praktikum;
import java.util.Scanner;
public class latprak24 {
    public static void main(String[] args) {
        System.out.println("Selamat datang di ULM Market");
        Scanner input = new Scanner(System.in);
        
        int pilih;
        
        System.out.print("Menu \n1. Nasi Goreng \n2. Cancel \nSilahkan pilih menu anda : ");
        pilih = input.nextInt();
        
        int jumlah;
        int harga = 15000;
        
        if (pilih == 1) {
            System.out.print("Jumlah Porsi : "); jumlah = input.nextInt();
            int total = jumlah*15000;
            if (total >= 50000) {
                int diskon = total*10/100;
                int total2 = total - diskon;
                
                System.out.println("Selamat! Karena anda telah membeli dengan total harga melebihi Rp50,000.00, anda mendapatkan diskon sebesar 10%. Total harga anda sekarang adalah " + total2);
            } 
            else if (total < 50000) {
            int diskon2 = 0;
            int total3 = total - diskon2;
            System.out.println("Anda telah membeli Nasi Goreng sebanyak " + jumlah + " porsi dengan harga " + total3);
            }
        }
        
        else if (pilih == 2) {
            System.out.println("Cancalled");
        }
        
        else {
            System.out.println("Tolong pilih antara 1 atau 2");
        }
    }
}