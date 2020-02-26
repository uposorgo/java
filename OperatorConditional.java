
package javaprograms;

import java.util.Scanner;

public class OperatorConditional {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
            int a,b,c;
            a = input.nextInt();
            b = input.nextInt();
        
          c = (a>b) ? a : b;
            System.out.println("Large: "+c);
          
    }
}
