import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n1, n2, mean;

        System.out.println("Digite a primeira menção: ");
        n1 = in.nextDouble();

        System.out.println("Digite a segunda menção: ");
        n2 = in.nextDouble();

        mean = (n1+n2)/2;

        if (mean>=8.5){
            System.out.println("O aluno tirou A");
        }else if (mean>=7){
            System.out.println("O aluno tirou B");
        }else if (mean>=5){
            System.out.println("O aluno tirou C");
        } else{
            System.out.println("O aluno tirou D");
        }
    }
}