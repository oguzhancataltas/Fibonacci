import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int total = 0, total1 = 1, total2;
        System.out.print("Bir Sayı Giriniz : ");
        int fibonacci = input.nextInt();

        System.out.print(total + ", ");
        for (int i = 1; i <= fibonacci; i++) {
            total2 = total1;
            total1 = total;
            total = total1 + total2;

            System.out.print(total + ", ");
        }
    }
}
