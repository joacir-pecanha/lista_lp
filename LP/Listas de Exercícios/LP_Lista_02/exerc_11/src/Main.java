import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double f, c;

        System.out.println("Digite a temperatura em celsius: ");
        c = in.nextDouble();

        f = c * 1.8 + 32;

        System.out.println("A temperatura em farenheit é: " + f);


    }
}