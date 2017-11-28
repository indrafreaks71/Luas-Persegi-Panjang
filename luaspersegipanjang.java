import java.util.Scanner;
public class luaspersegipanjang {
public static void main(String[] args) {
   double panjang, lebar, luas;

   Scanner scan = new Scanner(System.in);
   System.out.println("Program Menghitung Luas Persegi Panjang");
   System.out.println("=======================================");

   System.out.print("Masukan Panjang: ");
   panjang = scan.nextInt();
   System.out.print("Masukan Lebar: ");
   lebar = scan.nextInt();
 
   luas = (lebar * panjang);
   System.out.println("Luas Segi Panjang = " +luas);
   System.out.println("======================================");
   System.out.println("Rumus : L = p x l");

    }
}