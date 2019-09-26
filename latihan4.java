
package function;
import java.util.Scanner;

public class latihan4 {
    public static void lakukan (double a, double b){
        System.out.println("Kecepatanmu yaitu :" +(a / b)+"Km/jam");
        }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Jaraknya berapa : ");
        int jarak = input.nextInt();
        
        System.out.print("Waktumu berapa : ");
        int waktu = input.nextInt();
        
        lakukan(jarak,waktu);
    }
    
    
    
        
    
}
