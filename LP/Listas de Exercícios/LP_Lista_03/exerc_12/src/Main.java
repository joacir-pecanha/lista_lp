import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n1, n2;
        int opc;
        System.out.println("Digite dois números, separados por espaço: ");
        n1 = in.nextDouble();
        n2 = in.nextDouble();

        System.out.println("--------------------------" +
                "\n Menu:" +
                "\n--------------------------" +
                "\n  1.Soma" +
                "\n  2.Subtração" +
                "\n  3.Multiplacação" +
                "\n  4.Divisão "+
                "\n--------------------------");
        System.out.println("Escolha uma Opção: ");
        opc = in.nextInt();

        switch(opc){
            case 1:
                System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
                break;
            case 2:
                System.out.println(n1 + " - " + n2 + " = " + (n1-n2));
                break;
            case 3:
                System.out.println(n1 + " * " + n2 + " = " + (n1*n2));
                break;
            case 4:
                System.out.println(n1 + " ÷ " + n2 + " = " + (n1/n2));
                break;
            default:
                System.out.println("opção invalida!");

        }
    }
}