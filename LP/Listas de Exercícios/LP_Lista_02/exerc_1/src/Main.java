import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int num; //declaração de variáveis
        Scanner in = new Scanner(System.in); //garante a entrada de dados
        System.out.println("Digite um número: ");
        num = in.nextInt(); //leitura do dado de acordo com seu tipo
        System.out.println("O dobro é: " + (num *= 2)); //executa a operação de maneira resumida
    }
}