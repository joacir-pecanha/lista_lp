import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int [] vetor = {2,4,6,8,0,1,2,3,5,6,7,9};
        int n;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        n = in.nextInt();

        for(int i=0; i<vetor.length;i++){
            if(vetor[i]==n){
                System.out.println(n + " encontrado na posição " + i);
                return; // o return finaliza a função completamente, neste caso ele encerra a função main.
            }
        }
        System.out.println("Valor não encontrado!");
    }
}