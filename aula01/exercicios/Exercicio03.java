package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    
    public static void main(String[] args) {
        // 1. entrada
        // 1.1 scanner e a variavel para salario
        // 1.2 ler o valor do salario
        Scanner entrada = new Scanner(System.in);
        double salario, novoSalario;

        System.out.println("Informe o valor do salário:");
        salario = entrada.nextDouble();
        // 2. processamento
        // calcular um aumento de 25%
        // novoSalario = salario + salario * 0,25;
        novoSalario = salario * 1.25;

        // 3. saída
        // exibir o novo salario
        System.out.println("Novo Salário =" + novoSalario);

        entrada.close();
    }
}
