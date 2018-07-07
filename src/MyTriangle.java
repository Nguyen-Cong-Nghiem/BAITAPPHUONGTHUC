import java.util.Scanner;

public class MyTriangle {
    public static boolean isValid(double a, double b, double c) {
        if ((a + b) > c && ((a + c) > b) && (b + c) > a) {
            return true;
        }
        return false;

    }

    public static float getArea(double a, double b, double c) {
        float s;
        s = (float)(a + b + c) / 2;
        float area = (float)Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Dien tich hinh tam giac la: ");
        return area;
    }

    public static void main(String[] args) {
        double a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.print(" nhap vao canh a : ");
        a = sc.nextDouble();
        System.out.print(" nhap vao canh b: ");
        b = sc.nextDouble();
        System.out.print(" nhap vao canh c: ");
        c = sc.nextDouble();
        System.out.println( getArea(a,b,c));
    }
}
