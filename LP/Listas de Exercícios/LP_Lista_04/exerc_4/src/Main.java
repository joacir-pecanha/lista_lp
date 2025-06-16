//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double  f;

        System.out.println("====== conversão Fº para Cº");
        System.out.println("=============================================");
        System.out.println("Celsius =====> Fahrenheit");
        System.out.println("=============================================");

        for (int c = -80; c <= 80; c += 10){
            f = (9.0 / 5.0) * c + 32;
            System.out.println(c +"°C  " + f + "ºF ");
        }
    }
}