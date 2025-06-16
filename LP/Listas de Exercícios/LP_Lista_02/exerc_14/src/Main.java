import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double base, altura, result;

        System.out.println("digite a base do triângulo: ");
        base = in.nextDouble();

        System.out.println("digite a altura do triângulo: ");
        altura = in.nextDouble();

        result = base*altura /2;

        System.out.println("a área do triângulo retângulo é: " + result);
    }
}