
package javaprograms;

import java.util.Scanner;

public class OperatorRelational {
    public static void main(String[] args) {
        
        int a;
        Scanner input =new Scanner(System.in);
        System.out.print("Enter a Integer: ");
        
        a = input.nextInt();
        
        if(a>0){
            System.out.println("Positive");
        }
        else if(a<0){
            System.out.println("Negative");
        }
        else{
            System.out.println("Equal to zero");
        }
    }
}
