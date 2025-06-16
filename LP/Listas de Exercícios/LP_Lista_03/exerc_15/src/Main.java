import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Locale locatebr = new Locale("pt","BR");
        NumberFormat dinheiro = NumberFormat.getCurrencyInstance(locatebr);
        int opc;
        double valor, troco;
        System.out.print("Insira o dinheiro: ");
        valor = in.nextDouble();

        System.out.println("------------------------------" +
                "\n Menu:"+
                "\n     1. Café Expresso R$ 0,50" +
                "\n     2. Café Longo R$ 1,00" +
                "\n     3. Capuccino R$ 2,50" +
                "\n     4. Chocolate Quente R$ 2,00"+
                "\n------------------------------");
        System.out.print("Escolha uma opção: ");
        opc = in.nextInt();

        switch (opc) {
            case 1:
                System.out.println("------------------------------" +
                        "\nBebida selecionada: Café Expresso");
                if (valor >= 0.5) {
                    troco = valor - 0.5;
                    System.out.println("Seu Troco: " + dinheiro.format(troco));
                } else {
                    System.out.println("Saldo Insuficiente!");
                }
                break;
            case 2:
                System.out.println("------------------------------" +
                        "\nBebida selecionada: Café Longo");
                if (valor >= 1.00) {
                    troco = valor - 1.00;
                    System.out.println("Seu Troco: " + dinheiro.format(troco));
                } else {
                    System.out.println("Saldo Insuficiente!");
                }
                break;
            case 3:
                System.out.println("------------------------------" +
                        "\nBebida selecionada: Capuccino");
                if (valor >= 2.50) {
                    troco = valor - 2.50;
                    System.out.println("Seu Troco: " + dinheiro.format(troco));
                } else {
                    System.out.println("Saldo Insuficiente!");
                }
                break;
            case 4:
                System.out.println("------------------------------" +
                        "\nBebida Selecionada: Chocolate Quente");
                if (valor >= 2.00) {
                    troco = valor = 2.00;
                    System.out.println("Seu Troco: " + dinheiro.format(troco));
                }
                break;
            default:
                System.out.println("Opção Inválida");
        }
    }
}