import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n;
        int d;
        System.out.println("Digite o número: ");
        n = in.nextDouble();

        if (n % 2 == 0){
            System.out.println("O número é par");
        }else {
            System.out.println("O número é impar");
        }
    }
}