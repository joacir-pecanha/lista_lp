import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int [] array = new int [10];
        int minor=Integer.MAX_VALUE, major=Integer.MIN_VALUE, minorIndex=-1, majorIndex=-1;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite 10 números inteiros separados por espaço");

        for(int i=0; i<array.length;i++) //contador percorre o array enquanto for menor que o comprimento do array
            array[i] = in.nextInt(); // esse for faz o scanner, verificando as posições que o usuário digitou
        for (int i=0;i<array.length;i++){
            if(array[i]>major){
                major = array[i]; // acesso o valor dentro do vetor de acordo com a posição de minha variável de controle
                majorIndex = i; // atribuo ao index o valor do contador (variável de controle).
            }
            if(array[i]<minor){
                minor = array[i];
                minorIndex = i;

            }
        }
        System.out.println("Maior valor = " + major + " Posição = " + majorIndex);
        System.out.println("Menor valor = " + minor + " Posição = " + minorIndex);
        }
    }
