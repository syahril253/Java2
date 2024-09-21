package pkg8_operatoraritmatika;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        //Operator Aritmatika -> + - * / %//
        //Penjumlahan//
        System.out.println("5 + 7");
        System.out.println(5 + 7);
        
        int a = 18;
        int b = 22;
        int c = a + b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(a + b);
        System.out.println(c);
        System.out.println("===================");
        
        //Pengurangan//
        System.out.println("5 - 7");
        System.out.println(5 - 7);
        
        double x = 18.9;
        double y = 22.5;
        double z = x - y;
        System.out.println(x);
        System.out.println(y);
        System.out.println(x - y);
        System.out.println(z);
        System.out.println("===================");
        
        int m, s, r;
        System.out.print("Masukkan m =");
        m = input.nextInt();
        System.out.print("Masukkan s =");
        s = input.nextInt();
        r = m + s;
        System.out.print(m + " + " + s + " = ");
        System.out.println(r);
        
        r = m - s;
        System.out.println(m + " - " + s + " = " + r);
        
        //Perkalian dan Pembagian//
        r = m * s;
        System.out.println(m + " x " + s + " = " + r);
        r = m / s;
        System.out.println(m + " : " + s + " = " + r);
        
        //Sisa Bagi / Modulus//
        //Simbol sisa bagi adalah persen %//
        //Sisa bagi wajib memakai tipe data integer, tidak bisa memakai float ataupun double//
        r = m % s;
        System.out.println(m + " % " + s + " = " + r);
        System.out.print("Sisa Bagi / Modulus = ");
        System.out.println(10 % 2);
        System.out.print("Sisa Bagi / Modulus = ");
        System.out.println(9 % 2);
    }
    
}
