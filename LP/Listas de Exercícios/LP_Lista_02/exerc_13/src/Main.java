import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a, r;

        System.out.println("digite o raio: ");
        r = in.nextDouble();

        a = Math.PI * Math.pow(r,2);

        System.out.println(" A área do círculo é: " + a);
    }
}