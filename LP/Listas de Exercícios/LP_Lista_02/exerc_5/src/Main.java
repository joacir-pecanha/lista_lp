import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double km, ms;


        System.out.println("Digite a velocidade em km/h: ");
        km = in.nextDouble();
        ms = km / 3.6;
        System.out.println("A velocidade em m/s é: " + ms);
    }
}