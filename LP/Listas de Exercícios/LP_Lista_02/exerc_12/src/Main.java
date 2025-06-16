import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n1, n2, result;

        System.out.println("Insira o primeiro termo: ");
        n1 = in.nextDouble();

        System.out.println("Insira o segundo termo: ");
        n2 = in.nextDouble();

        result = (n1 + n2 * 2) / 3;

        System.out.println("A média ponderada é: " + result);
    }
}