import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {

        // Değişkenler tanımlandı.
        double boy, kilo, BMI;

        // Scanner sınıfından nesne türetildi.
        Scanner inp = new Scanner(System.in);

        System.out.print("Boyunuzu metre cinsinden giriniz: ");
        boy = inp.nextDouble();

        System.out.print("Kilonuzu kilogram cinsinden giriniz: ");
        kilo = inp.nextDouble();

        BMI = kilo / (boy * boy);

        // Sonucu virgülden sonra iki basamakla göstermek için DecimalFormat kullanılıyor.
        // Örneğin şöyle bir 23.148148148148145 BMI yerine 23.15 olarak çıktı veriyor. (1.8m,75 kg)

        DecimalFormat df = new DecimalFormat("#.##");
        String formattedBMI = df.format(BMI);

        System.out.println("Beden Kitle İndeksiniz: " + formattedBMI);

        // BMI'ye göre denk gelen kilo aralıkları yazdırıldı.
        if (BMI < 18.5) {
            System.out.println("Düşük kilo aralığındasınız.");
        } else if ((BMI >= 18.5) && (BMI <= 24.9)) {
            System.out.println("Kilonuz normal aralıkta.");
        } else if ((BMI > 24.9) && (BMI <= 29.9)) {
            System.out.println("Fazla kilo aralığındasınız.");
        } else if ((BMI > 29.9) && (BMI <= 39.9)) {
            System.out.println("Obez kilo aralığındasınız.");
        } else {
            System.out.println("Morbid Obez kilo aralığındasınız.");
        }
    }
}
