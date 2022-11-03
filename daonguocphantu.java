import java.util.Scanner;

public class daonguocphantu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        System.out.println("Nhap vao size cua mang");
        size = scanner.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhap vao phan tu thu" + (i + 1));
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%5d", arr[i]);
        }
        int[] newArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[arr.length - 1 - i];
            System.out.printf("%5d", newArray[i]);
        }
    }
}