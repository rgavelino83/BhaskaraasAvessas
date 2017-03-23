package bhaskaraasavesas;

import java.util.Scanner;

public class BhaskaraAsAvesas {

    public static void main(String[] args) {
       Scanner console = new Scanner(System.in);
       //ENTRADA
       System.out.print("X1: ");
       double x1 = Double.parseDouble(console.nextLine());
       System.out.print("X2: ");
       double x2 = Double.parseDouble(console.nextLine());
       System.out.print("C: ");
       double c = Double.parseDouble(console.nextLine());
       //PROCESSAMENTO
       double s = x1 + x2;
       double p = x1 * x2;
       double a = c / p;
       double b = -(s * a);
       //SAÍDA
       System.out.println("A equação que raizes " + x1 + " X1 e "+ x2 + " X2 é " + a + " A² + " + b + " Bx + " + c + " C");
        
    }

}
