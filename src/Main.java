import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int r;
        double alan, çevre, alpha, dilimAlan;

        double pi = 3.14d;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Dairenin yarıçapını giriniz: ");
        r = scanner.nextInt();

        System.out.print("Dairenin diliminin merkez açı ölçüsünü giriniz: ");
        alpha = scanner.nextInt();

        çevre = 2 * r * pi;
        alan = Math.pow(r,2) * pi;

        System.out.println("Dairenin çevresi: " + çevre );
        System.out.println("Dairenin alanı: " + alan);

        dilimAlan = pi * Math.pow(r,2) * alpha / 360;

        System.out.println("Daire diliminin alanı: " + dilimAlan);

    }
}
