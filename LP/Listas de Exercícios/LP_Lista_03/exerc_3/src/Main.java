import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n1, n2, mean;

        System.out.println("Digite as duas notas do aluno, separadas por espaço: ");
        n1 = in.nextDouble();
        n2 = in.nextDouble();

        mean = (n1 + n2) / 2;

        if(mean<50){
            System.out.println("Aluno Reprovado ");
        }else{
            System.out.println("Aluno Aprovado");
        }
    }
}