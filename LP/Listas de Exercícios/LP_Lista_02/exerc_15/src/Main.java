import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double v, r, h;

        System.out.println("Digite o raio da base do cilindro: ");
        r = in.nextDouble();

        System.out.println("digite a altura do cilindro: ");
        h = in.nextDouble();

        v = (3.14159*(r*r))*h;

        System.out.println("O volume do cilindro em cm³ é: " + v);
    }
}