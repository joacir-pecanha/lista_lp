import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int option;
        System.out.println("--------------------------" +
                "\n BANCO" +
                "\n--------------------------" +
                "\n 5. Saques" +
                "\n 6. Depósitos" +
                "\n 7. Consultar Saldo" +
                "\n 8. Extrato "+
                "\n 9. Transferências" +
                "\n--------------------------");
        System.out.println("Escolha uma Opção: ");
        option = in.nextInt();
        switch (option){
            case 5:
                System.out.println("Opção Selecionada:\n 5. Saques");
                break;
            case 6:
                System.out.println("Opção Selecionada:\n 6. Depósitos");
                break;
            case 7:
                System.out.println("Opção Selecionada:\n 7. Consultar Saldo");
                System.out.println("Saldo atual: 1359,80 R$");
                break;
            case 8:
                System.out.println("Opção Selecionada: 8. Extrato");
                System.out.println("Tipo: Transferência"
                        + "\n--------------------------"
                        + "\nRealizada em: 30/03/2025" +
                        "\nValor: 440,89" +
                        "\nBeneficiário: Companhia Piratininga de Força e Luz");
                break;
            case 9:
                System.out.println("Opção Selecionada: 9. Transferências");
                break;
            default:
                System.out.println("Opção Inválida.");
        }
    }
}