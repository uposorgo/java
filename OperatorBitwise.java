

package javaprograms;

public class OperatorBitwise {
//    &(AND) |(OR) ^(XOR) ~(NOT) >>(RIGHT SHIFT) <<(LEFT SHIFT) 
    public static void main(String[] args) {
        int a,b;
        a = 32;
        b = 4;
        
        int c = a & b;
        int d = a | b;
        int e = a ^ b;
        int f = a>>3;
        int g = b<<3;
        int h = ~a;
        
//        System.out.println("a & b = "+c "\n"  "a | b = "+d "\n""a ^ b = "+e "\n""a >>3 = "+e "\n""b <<3 = "+e "\n");
        System.out.printf("a & b = %d\na | b = %d\na ^ b = %d\na >> = %d\n b << = %d\na ~ b = %d",c,d,e,f,g,h);
    }
}
