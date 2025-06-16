import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int dia; // declaração de variáveis

        System.out.println("Insira um dia de 1 a 7:");
        dia = in.nextInt();

        switch (dia) { // o switch case é uma estrutura de decisão criada para facilitar a vida e economizar processamento,
            // evitando que venhamos a utilizar multiplos IF-else em um programa.
            case 1:
                System.out.println("domingo");
                break;
            case 2:
                System.out.println("segunda");
                break;
            case 3:
                System.out.println("terça");
                break;
            case 4:
                System.out.println("quarta");
                break;
            case 5:
                System.out.println("quinta");
                break;
            case 6:
                System.out.println("sexta");
                break;
            case 7:
                System.out.println("sábado");
                break;
            default:
                System.out.println("dia inválido."); // o default serve para quando o programa receber um valor diferente dos
                // dos definidos pelo programador.
        }
    }
}