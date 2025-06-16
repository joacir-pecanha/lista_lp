import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int n;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        n = in.nextInt();

        //for(declar_var_ctrl ; teste_logico ; inc)
        for(int i=0; i<=10; i++){ //se quiser ir de 2 em 2 só mudar o "i++" para i+=2 (ou qualquer valor)
            System.out.println(n + " x " + i + "= " + (i*n) );
        }

    }
}