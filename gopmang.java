import java.util.Scanner;

public class gopmang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr1 = new int[5];
        int[] arr2 = new int[4];
        int[] arr3 = new int[arr1.length+ arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Nhap vao phan tu thu: " + (i+1) + " cua arr1");
            arr1[i] = scanner.nextInt();
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("Nhap vao phan tu thu: " + (i+1) + " cua arr2");
            arr2[i] = scanner.nextInt();
        }
        for (int i = 0; i < arr1.length; i++) {
            arr3[i]=arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[i+arr1.length] = arr2[i];
        }
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i] + ", ");
        }
    }
}
