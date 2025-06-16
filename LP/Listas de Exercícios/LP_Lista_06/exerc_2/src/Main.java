import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int number;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número: ");
        number = in.nextInt();

        System.out.println(number + "! = " + fatorial(number));
    }

    public static int fatorial(int n) {
        if (n == 1)
            return 1;

        return n *= fatorial(n - 1);
    }
}

