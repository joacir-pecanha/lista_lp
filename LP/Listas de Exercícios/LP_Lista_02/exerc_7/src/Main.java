import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        double mm, pol;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a medida em mm: ");
        mm = in.nextDouble();
        pol = mm / 25.4;
        System.out.println("A medida em pol. é: " + pol);
    }
}