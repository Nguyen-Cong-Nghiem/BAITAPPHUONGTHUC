import java.util.Scanner;
public class SoDoiXung {
    public static void reverse(int number)
    {
        int temp = 0;

        while (number > 0){

                    temp = number % 10;
            System.out.print(temp);
            number = number / 10;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so ban muon: ");
        int number = scanner.nextInt();

        reverse(number);
    }


}

