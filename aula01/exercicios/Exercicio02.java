package exercicios;

import java.util.Scanner;

public class Exercicio02 {
   
    
    public static void main(String[] args) {
        // entrada - ler 2 notas
        Scanner entrada = new Scanner(System.in);
        double nota1, nota2, media;

        System.out.println("Digite a primeira nota:");
        nota1 = entrada.nextDouble();
        System.out.println("Digite a segunda nota:");
        nota2 = entrada.nextDouble();

        //processamento - calcular a média
        media = (nota1 + nota2) / 2;

//saida - exibir a media
        System.out.println("Media = " + media);
        entrada.close();
    }
}
