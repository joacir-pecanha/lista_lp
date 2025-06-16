import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double milhas, km;
        Scanner in = new Scanner(System.in);

        System.out.println("Digite a distância em kms: ");
        km = in.nextDouble();
        milhas = km / 1.6;
        System.out.println("A distância em milhas é: " + milhas);
    }
}