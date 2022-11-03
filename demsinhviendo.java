import java.util.Scanner;

public class demsinhviendo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so luong diem");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhap vao diem cua sinh vien thu: "+ (i+1));
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >=5 && arr[i] <= 10) {
                count++;
            }
        }
        System.out.println("So sinh vien do la: " + count);
    }
}
