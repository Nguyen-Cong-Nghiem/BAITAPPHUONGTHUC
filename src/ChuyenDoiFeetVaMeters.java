import java.util.Scanner;

public class ChuyenDoiFeetVaMeters {
    public static double feettoMeter(double feet) {
        return 0.305 * feet;
    }

    public static double metersToFeet(double meter) {
        return 3.279 * meter;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so feet: ");
        double foot = sc.nextDouble();
        System.out.print("Nhap vao so meter: ");
        double meters = sc.nextDouble();
        System.out.println("Doi feet sang meter la: " + feettoMeter( foot));
        System.out.println("Doi meter sang feet la: " + metersToFeet(meters));

    }
}
