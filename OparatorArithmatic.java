
package javaprograms;

import java.util.Scanner;


public class OparatorArithmatic {
    public static void main(String[] args) {
        
        int a,b,c;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Give the value of a & ");
        a = input.nextInt();
        b = input.nextInt();
        
        c = a + b;
        System.out.println("Sum of a & b is: "+c);
        c = a - b;
        System.out.println("Sub of a & b is: "+c);
        c = a * b;
        System.out.println("Mul of a & b is: "+c);
        c = a / b;
        System.out.println("Div of a & b is: "+c);
        c = a % b;
        System.out.println("Mod of a & b is: "+c);
    }
    
}
