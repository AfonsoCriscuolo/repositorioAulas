package exemplos;

public class Exemplo05 {
    public static void main(String[] args) {
        double valor=345.987;
        int numero = 34;
        String nome = "Afonso";

        System.out.println(valor);
        //System.out.print(FORMATO , vARIÁVEIS);
        // %d - int  %f - double %s -  String
        System.out.printf("%f\n", valor);
        System.out.printf("%.2f\n", valor); // .2 - 2 casas decimais

        System.out.printf("int = %d, double = %f\n", numero, valor);
        System.out.printf("Nome= %s - %d\n", nome, numero);
    }
}
