package exercicios;


import java.util.Scanner;

public class Exercicio5 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String senha;
        boolean senhaAceita;

        System.out.println("Informe a senha:");
        senha = entrada.nextline();



        senhaAceita = senha.equals("R10p5");

        if(senhaAceita) { // if(senhaAceita == true) {
            System.out.println("acesso concedido");

        } else {
            System.out.println("acesso negado");
        }
    }
        entrada.close();
    
}
