public class KiemTraSoNguyenTo {
    public static boolean soNguyenTo(int n) {
        if (n < 2) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }return true;
        }
    }

    public static void main(String[] args) {
        System.out.println("Cac so nguyen to nho hon 1000 la: ");
        for (int i = 2; i < 1000; i++) {
            if (soNguyenTo(i)) {
                System.out.println(i + " ");
            }
        }
    }

}
