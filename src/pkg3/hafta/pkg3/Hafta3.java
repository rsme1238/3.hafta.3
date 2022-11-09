
package pkg3.hafta.pkg3;

import java.util.Scanner;

public class Hafta3 {

    
    public static void main(String[] args) {
        
        Scanner input= new Scanner(System.in);
        System.out.println("Enter A side of triangle ");
        int a = input.nextInt();
        
         System.out.println("Enter B side of triangle ");
        int b = input.nextInt();
        
         System.out.println("Enter C side of triangle ");
        int c = input.nextInt();
        
        if(a==b && a==c){
            System.out.println("triangle is 3 equilateral");
        }
        else if(a==b || a==c || b==c){
            System.out.println("triangle is 2 equilateral");
        }
         else {
            System.out.println("triangle is not equilateral");
        }
       
    }
    
}
