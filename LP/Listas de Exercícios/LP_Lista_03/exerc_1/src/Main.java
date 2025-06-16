import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double num, result;
        System.out.println("Digite um número inteiro: ");
        num = in.nextDouble();

        result = Math.sqrt(num);

        if (result<0){
            System.out.println("número inválido!");
        }else {
            System.out.println(result);
        }
    }
}