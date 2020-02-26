//VOWEL or CONSONANT

package javaprograms;
import java.util.Scanner;
public class OperatorLogicalOR {
    public static void main(String[] args) {
        
        char ch;
        System.out.print("Enter a character:");
        
        Scanner farhan = new Scanner(System.in);
        ch = farhan.next().charAt(0);
        
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
            System.out.println("VOWEL");
        }
        else{
            System.out.println("CONSONANT");
        }
    }
}
