import java.util.Scanner;

public class timmaxtrongmang {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhap vao so thu: " + (i+1));
            arr[i] = scanner.nextInt();
        }
        int max = arr[0];
        for (int a: arr) {
            if (a > max) {
                max = a;
            }
        }
        System.out.println("Gia tri lon nhat cua mang la: " + max);
    }
}
