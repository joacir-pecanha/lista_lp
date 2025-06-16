import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double b, c, x1, x2;

        System.out.println("Digite o valor da primeira raiz (x1):  ");
        x1 = in.nextDouble();
        System.out.println("Digite o valor da segunda raíz (x2): ");
        x2 = in.nextDouble();

        b = -x1 -x2;
        c = -x1 * -x2;

        System.out.println("x² + "+ b + "x + " + c + "x = 0");
    }
}