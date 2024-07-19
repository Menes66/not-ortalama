import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int matematik, fizik, kimya, turkce, tarih, muzik;

        Scanner ort = new Scanner(System.in);

        System.out.print("Matematik Notunuz: ");
        matematik = ort.nextInt();

        System.out.print("Fizik Notunuz: ");
        fizik = ort.nextInt();

        System.out.print("Kimya Notunuz: ");
        kimya = ort.nextInt();

        System.out.print("Türkçe Notunuz: ");
        turkce = ort.nextInt();

        System.out.print("Tarih Notunuz: ");
        tarih = ort.nextInt();

        System.out.print("Müzik Notunuz: ");
        muzik = ort.nextInt();

        double sonuc = (matematik + fizik + kimya + turkce + tarih + muzik) / 6;
        System.out.println("Ortalamanız : " + sonuc);

        System.out.println( sonuc >= 50 ? "GEÇTİN" : "KALDIN");
    }
}
