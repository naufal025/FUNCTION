
 
package kalkulator_sederhana;
import java.util.Scanner;

public class Kalkulator_Sederhana {
   
   public static void penjumlahan (int a, int b){
      System.out.println("Ini Penjumlahan :" +(a+b));
   }
        
    public static void pengurangan (int a, int b){
        System.out.println("Ini pengurangannya :" +(a-b));
    }
        
    public static void perkalian (int a, int b){
        System.out.println("Ini perkaliannya :" +(a*b));
    }
        
    public static void pembagian (double a, double b){
        System.out.println("Ini pembagiannya :" +(a/b));
    }
    
    public static void sisahasilbagi (double a, double b){
        if(a>b){
            System.out.println("sisa  hasil bagi" +(a%b));
        }else if (a<b){
                System.out.println(" sisa hasil bagi = System not found");
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("---===KALKULATOR HEHE===---");
        
        System.out.print("Bil I : ");
        int a = input.nextInt();
        
        System.out.print("Bil II : ");
        int b = input.nextInt();
        
        penjumlahan(a,b);
        pengurangan(a,b);
        perkalian(a,b);
        pembagian(a,b);
        sisahasilbagi(a,b);
    }
        
        
      
            
    }

    
        
        
            
        

    
        
   
        
        
    
        
        
        
        
        
       
        
        
       
    
    


 
   