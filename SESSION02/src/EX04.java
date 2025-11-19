import java.util.Scanner;

public class EX04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age = 0;

        do {
            System.out.print("Vui lòng nhập vào tuổi của bạn: ");
            if (input.hasNextInt()) {
                age = input.nextInt();
                if (age <= 0) {
                    System.out.println("Vui lòng nhập vào một số nguyên và lớn hơn 0.");
                }
            } else {
                System.out.println("Vui lòng nhập vào một số nguyên và lớn hơn 0.");
                input.next();
            }
        } while (age <= 0);

        System.out.printf("Tuổi của bạn là %d !%n", age);

        input.close();
    }
}
