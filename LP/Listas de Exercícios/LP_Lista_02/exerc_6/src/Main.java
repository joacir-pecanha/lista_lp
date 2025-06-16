import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner in = new Scanner(System.in);
        double km, ms;

        System.out.println("Digite a Velocidade em m/s: ");
        ms = in.nextDouble();
        km = ms * 3.6;
        System.out.println("A velocidade em km/h é: " + km);
    }
}