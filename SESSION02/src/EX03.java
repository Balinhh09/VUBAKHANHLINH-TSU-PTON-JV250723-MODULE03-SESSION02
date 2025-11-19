import java.util.Scanner;

public class EX03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap mot so nguyen duong bat ky: ");
        int N = sc.nextInt();

        if(N <= 0) {
            System.err.println("Số nhập vào không hợp lệ");
        } else {
            int sum = 0;

            for (int i = 1; i <= N; i++) {
                sum += i;
            }
            System.out.printf("Tong cac so tu 1 den %d la: %d%n", N, sum);
        }
        sc.close();
    }
}
