import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n1, n2; //declaração de variáveis

        System.out.println("Digite dois números, separados por espaço: ");
        n1 = in.nextDouble();
        n2 = in.nextDouble();// recebe numeros separados por espaço de acordo com o scanner


        if (n1 > n2) { // testes condicionais para verificar qual número é maior, ou se são iguais
            System.out.println("o primeiro número é maior");
        } else if (n1 == n2) {
            System.out.println("os números são iguais");

        } else {
            System.out.println("o segundo número é maior");
        }
    }
}