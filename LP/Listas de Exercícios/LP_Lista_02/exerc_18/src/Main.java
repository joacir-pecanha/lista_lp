import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a, x , b;

        System.out.println("Digite o valor do coeficiente(a): ");
        a = in.nextDouble();

        System.out.println("Digite o valor da constante(b):" );
        b = in.nextDouble();

        //b = b*-1; o valor negativo também pode ser obtido com a declaração -b

        x = -b/a;
        System.out.println("o valor de x é:" + x);
    }
}