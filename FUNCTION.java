
package function;
import java.util.Scanner;
public class FUNCTION {
    public static void hitung(int a, int b) {
        System.out.println("Hasil " + (a + b));
      
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan pertama : ");
        int bil1 = input.nextInt();
        
        System.out.print("Masukkan bilangan kedua : ");
        int bil2 = input.nextInt();
        
        hitung(bil1, bil2);
    }
    
}
