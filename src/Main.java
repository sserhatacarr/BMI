import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double boy, kilo, BMI;

        Scanner inp = new Scanner(System.in);

        System.out.print("Boyunuzu giriniz : ");
        boy = inp.nextDouble();

        System.out.print("Kilonuzu giriniz : ");
        kilo = inp.nextDouble();

        BMI = kilo / (boy * boy);
        System.out.print("Beden kitle indexiniz : " + BMI);


    }
}
