import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a, b, c, x1, x2, delta;

        System.out.println("digite os valores de a,b e c separados por espaço: ");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        delta = Math.pow(b,2) - 4 * a *c;

        x1 = (-b + Math.sqrt(delta)) / 2 * a;
        x2 = (-b - Math.sqrt(delta)) / 2 * a;

        System.out.println(a+"x² +" + b+"x + " +c+ " = 0");
        System.out.println("x1 = " + x1 + "e x2 = " + x2);

    }
}