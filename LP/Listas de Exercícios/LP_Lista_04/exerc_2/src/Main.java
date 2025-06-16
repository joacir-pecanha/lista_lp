import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n, bigger, minor;

        System.out.print("Digite o 1º número: ");
        n = in.nextInt();

        bigger = n;
        minor = n;

        for (int i = 2; i <= 5; i++) {
            System.out.print("Digite o " + i + "º número: ");
            n = in.nextInt();

            if (n > bigger) {
                bigger = n;
            }

            if (n < minor) {
                minor = n;
            }
        }

        System.out.println("\n o Maior número é: " + bigger);
        System.out.println("o Menor número digitado é: " + minor);
    }
}
