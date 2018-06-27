import java.util.Scanner;

public class TinhTongChuSoTrongSoNguyen {
    public static int sumDigit(int  number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number = number / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so n: ");
        int n = sc.nextInt();
        System.out.println("Tong 2 chu so cua " + n + " la: " + sumDigit(n));
    }
}
