import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opc;

        System.out.println("Menu:" +
                "\n     1. Círculo" +
                "\n     2. Triângulo Retângulo" +
                "\n     3. Retângulo" +
                "\n--------------------------");
        System.out.println("Escolha uma Opção: ");
        opc = in.nextInt();

        switch (opc){
            case 1:
                double r, result;
                System.out.println("--------------------------");
                System.out.println("insira o raio do círculo");
                r = in.nextDouble();

                result = Math.PI * Math.pow(r, 2);
                System.out.println("--------------------------");
                System.out.println("a área do círculo é " + result);
                System.out.println("--------------------------");
                break;
            case 2:
                double b, a, areaT, perimetro;
                System.out.println("--------------------------");
                System.out.println("insira a base do triângulo: ");
                b = in.nextDouble();
                System.out.println("insira a altura do triângulo: ");
                a = in.nextDouble();
                System.out.println("--------------------------");

                areaT = (b * a)/2;

                perimetro = b*a;

                System.out.println(" á área do triângulo é: " + areaT);
                System.out.println(" o perímetro  do triângulo é: " + perimetro);
                break;
            case 3:
                double altura, base, areaR;
                System.out.println("--------------------------");
                System.out.println("insira a base do retângulo: ");
                base = in.nextDouble();
                System.out.println("insira a altura do retângulo: ");
                altura = in.nextDouble();
                System.out.println("--------------------------");

                areaR = base * altura;

                System.out.println("a área do retângulo é: " + areaR);
                break;
            default:
                System.out.println("opção inválida!");

        }
    }
}