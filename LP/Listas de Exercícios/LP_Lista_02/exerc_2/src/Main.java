import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            int num; // declaração da variável
            Scanner in = new Scanner(System.in);
        System.out.println("digite um número: ");
        num = in.nextInt();
        System.out.println("a raíz quadrada é: " + (num *= num));
    }
}