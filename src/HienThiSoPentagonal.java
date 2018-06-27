import java.util.Scanner;

public class HienThiSoPentagonal {
    public static int getPentagonal(int i) {
        if (i < 1) {
            System.out.println("ko tinh duoc!!");
        } else {
            i=i*(3*i-1)/2;
        }
        return i;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so i: ");
        int i = sc.nextInt();
        System.out.println("So pentagonal la: "+ getPentagonal(i));
    }
}
