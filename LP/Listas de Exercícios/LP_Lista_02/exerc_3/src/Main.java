import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double num; // entrada de dados
        Scanner in = new Scanner(System.in); // inicia scanner
        System.out.println("Digite um número: ");
        num = in.nextDouble(); // leitura dos dados

        System.out.println("a quinta parte do número é: " + (num / 5)); //operação
    }
}