//Capital letter or Small Letter
//Logical AND Operator
// && || ! 
package javaprograms;

import java.util.Scanner;


public class OperatorLogicalAND {
    public static void main(String[] args) {
        
        char ch;
        System.out.print("Enter a Character: ");
        
        Scanner farhan = new Scanner(System.in);
        ch = farhan.next().charAt(0);
        
        if(ch>='a' && ch<='z'){
            System.out.println("Small Letter");
        }
        else if(ch>='A' && ch<='Z'){
            System.out.println("Capital Letter");
        }
        else{
            System.out.println("Not A Letter");
        }
    }
}
