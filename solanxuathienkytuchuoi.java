import java.util.Scanner;

public class solanxuathienkytuchuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao mot chuoi bat ky:");
        String str = scanner.nextLine();
        System.out.println("Nhap vao mot ky tu bat ky:");
        String word = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (word.charAt(0) == str.charAt(i)) {
                count++;
            }
        }
        System.out.println("Phan tu " + word + " xuat hien " + count + " lan trong day " + str );
    }
}