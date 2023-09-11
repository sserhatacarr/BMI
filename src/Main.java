import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double boy, kilo, BMI;
        // Değişkenler tanımlandı.
        
        Scanner inp = new Scanner(System.in);
        //Scanner sınıfından nesne türetildi.

        System.out.print("Boyunuzu metre cinsinden giriniz : ");
        boy = inp.nextDouble();

        System.out.print("Kilonuzu kilogram cinsinden giriniz : ");
        kilo = inp.nextDouble();

        BMI = kilo / (boy * boy);
        System.out.print("Beden kitle indexiniz : " + BMI);
        //Beden kitle endeksi hesaplandı.

        if ( BMI < 18.5 ) {
            System.out.print( "Düşük kilo aralığındasınız.");
        } else if ( (BMI >= 18.5) && (BMI <= 24.9) ) {
            System.out.print( "Kilonuz normal aralıkta.");
        } else if ( (BMI > 24.9) && ( BMI <= 29.9)) {
            System.out.print( "Fazla kilo aralığındasınız.");
        } else if ( (BMI > 29.9) && (BMI <= 39.9)) {
            System.out.print( "Obez kilo aralığındasınız.");
        } else {
            System.out.print("Morbid Obez kilo aralığındasınız.");
        }
        //BMI'ye göre denk gelen kilo aralıkları yazdırıldı.


    }
}
