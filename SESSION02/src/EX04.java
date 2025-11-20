import java.util.Scanner;

public class EX04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age = 0;
        boolean isValidAge = false;

        do {
            System.out.println("Moi ban nhap tuoi: ");
            if (input.hasNextInt()) {
                age = input.nextInt();
                if (age > 0) {
                    isValidAge = true;
                } else {
                    System.out.println(" Vui lòng nhập vào một số nguyên và lớn hơn 0!");
                }
            } else {
                System.out.println(" Vui lòng nhập vào một số nguyên  và lớn hơn 0!");
                input.next();
            }
        } while (!isValidAge);
        System.out.println("Tuổi của bạn là: " + age);
        input.close();
    }
}
