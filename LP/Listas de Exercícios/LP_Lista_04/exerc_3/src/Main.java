//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Estes são os números positivos divisíveis por 4 e menores que 200: ");
        for (int i = 1; i < 200; i++) {
            if (i % 4 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}