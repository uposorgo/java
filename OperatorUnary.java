/*
 * +, -, ++, -- are   UNARY OPERATOR
 */
package javaprograms;
import java.util.Scanner;
public class OperatorUnary {
    public static void main(String[] args) {
        int x,y;
        Scanner input = new Scanner(System.in);
        System.out.print("Give value of x & y: ");
        x = input.nextInt();
        y = input.nextInt();
        
        x = +x;
        y = -y;
        System.out.printf("x=%d y=%d",x,y);
        
    }
}
