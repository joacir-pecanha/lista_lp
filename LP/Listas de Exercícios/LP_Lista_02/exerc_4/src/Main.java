import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double num1, num2, result; // declaração de variáveis.
        System.out.println("Digite a primeira menção: ");
        num1 = in.nextDouble(); // entrada de dados.
        System.out.println("Digite a segunda Menção: ");
        num2 = in.nextDouble();
        result = (num1+num2)/2; // faz o cálculo da média e armazena na variavel.

        System.out.println("a média é: " + result); //exibição do resultado na variável.

    }
}