import java.util.Scanner;

public class EX01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Moi ban nhap mot so nguyen bat ky: ");
        int number = input.nextInt();

        if (number == 0) {
            System.out.println("Số không phải chẵn cũng không phải lẻ");
        } else if (number % 2 == 0) {
            System.out.printf("%d la so chan", number);
        } else {
            System.out.printf("%d la so le", number);
        }
        input.close();
    }
}