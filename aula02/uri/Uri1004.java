package uri;

import java.util.Scanner;

public class Uri1004 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n1, n2, prod;

       // System.out.println("Digite um número");
       n1 = teclado.nextInt();
       n2 = teclado.nextInt();

       prod = n1 * n2;

       System.out.println("PROD =" + prod);
       
       teclado.close();
    }
}