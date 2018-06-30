import java.util.Scanner;
public class SapXepGiamDan {
    public static int[] tinhMang(int[]mang) {

        for (int i = 0; i < mang.length; i++) {
            for (int j = 0; j < mang.length - 1; j++) {
                int temp = mang[i];
                if (mang[i] > mang[j]) {
                    mang[i] = mang[j];
                    mang[j] = temp;
                }
            }
        }
        return mang;

    }

    static void displayMang (int[] mang) {
        System.out.println("Mang mới là: ");
        for (int i = 0; i < mang.length; i++) {
            System.out.print(mang[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao do dai mang: ");
        int size = sc.nextInt();
        int[]mang;
        mang = new int[size];
        System.out.println("Nhap vao cac gia tri cho mang: ");
        for (int i = 0; i < size; i++) {
            mang[i] = sc.nextInt();
        }
        tinhMang(mang);
        displayMang(mang);



    }
}
