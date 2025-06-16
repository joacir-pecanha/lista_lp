import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n1, n2, mean, rec; //declaração de variáveis.
        System.out.println("Digite as duas notas separadas por espaço: ");
        n1 = in.nextDouble();
        n2 = in.nextDouble();

        mean = (n1+n2)/2; // calculo inicial da média

        if(mean<50){ // início da condicional inicial, é melhor iniciar o teste lógico com a opção com maior condições.
            System.out.println("Insira a nota da prova de recuperação: ");
            rec = in.nextDouble();
            mean = (n1+rec)/2;
            if(mean<50){ // ao inserir a nota de recuperação, um novo cálculo de média é feito, entrando em uma nova condicional para verificar a aprovação.
                System.out.println("Aluno Reprovado após prova de recuperação");
            }else{
                System.out.println("Aluno Aprovado após prova de recuperação");
            }
        }else{
            System.out.println("Aluno Aprovado"); // caso a primeira média já resultar em > 50 o programa exibe que o aluno foi aprovado.
        }
    }
}