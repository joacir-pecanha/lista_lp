import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double l1,l2,l3;

        System.out.println("Digite os três lados do triângulo, separado por espaço");
        l1 = in.nextDouble();
        l2 = in.nextDouble();
        l3 = in.nextByte();

        if (l1==l2 & l1 == l3){
            System.out.println("o triangulo é equilátero");
        } else if (l1 == l2 || l1 == l3 & l1 != l3) {
            System.out.println("o triângulo é isósceles");
        }else {
            System.out.println("o triângulo é escaleno");
        }
    }
}