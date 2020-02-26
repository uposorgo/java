
package javaprograms;

import java.util.Scanner;

public class InputScannerDataTypes {
    public static void main(String[] args) {
          System.out.println("Give all Input:");
        Scanner input= new Scanner(System.in);
       
         System.out.println("Give Input string:");
        String st = input.nextLine();
        
        System.out.println("Give Input char:");
        char ch = input.next().charAt(0);
        
         System.out.println("Give Inputbyte:");
       byte by = input.nextByte();
       
        System.out.println("Give Input bollean:");
       boolean bo = input.nextBoolean();
       
       
        System.out.println("Give Input short:");
        short sh = input.nextShort();
        
         System.out.println("Give Input  integer:");
       int in = input.nextInt();
       
        System.out.println("Give Input float:");
       float  fl = input.nextFloat();
       
        System.out.println("Give Input  long:");
       long  lo = input.nextLong();
       
        System.out.println("Give Input double:");
       double dou = input.nextDouble();
       
 
        System.out.println("Result: "+ch+by+bo+sh+in+fl+lo+dou+st);
        
    }
}
