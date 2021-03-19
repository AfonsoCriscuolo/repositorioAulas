package exercicios;

public class Exercicio07 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario;

        System.out.println("Digite o valor do salário:");
        salario = entrada.nextDouble();

        if (salario <= 600) {
            System.out.println("isento");

        } else {
            if (salario <= 1200) {
                System.out.println("Desconto de 20%");
                
            }
        }
        }
    }
}
