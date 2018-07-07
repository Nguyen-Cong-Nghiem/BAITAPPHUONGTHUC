package demlanxuathientrongchuoi;

import java.util.Scanner;

public class DemKiTuTrongChuoi {
    public static final char SPACE = ' ';
    public static final char TAB = '\t';
    public static final char BREAK_LINE = '\n';

    public static int countLetters(String s) {
        if (s == null) {
            return -1;
        }
        int count = 0;
        int size = s.length();
        boolean notCounted = true;
        for (int i = 0; i < size; i++) {
            if (s.charAt(i) != SPACE && s.charAt(i) != TAB
                    && s.charAt(i) != BREAK_LINE) {
                if (notCounted) {
                    count++;
                    notCounted = false;
                }
            } else {
                notCounted = true;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao 1 chuoi: ");
        String str = sc.nextLine();
        System.out.print("Số từ của chuỗi đã cho là: "
                + countLetters(str));
    }
}
