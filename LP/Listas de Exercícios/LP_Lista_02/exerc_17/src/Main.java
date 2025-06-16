import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double vI, a, t, vF;

        System.out.println("digite a velocidade inicial em m/s: ");
        vI = in.nextDouble();

        System.out.println("digite a aceleração em m/s²: ");
        a = in.nextDouble();

        System.out.println("digite o tempo em segundos: ");
        t = in.nextDouble();

        vF = vI + a * t;

        System.out.println("A velocidade final é: " + vF + "m/s");
    }
}