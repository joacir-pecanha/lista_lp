import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, fatorial;
        fatorial = 1;

        System.out.println("Digite um número: ");
        n = in.nextInt();
        System.out.print(n + "! = ");

        while (n>1){
            fatorial*=n;
            n--;
        }

        System.out.println(fatorial);
    }
}