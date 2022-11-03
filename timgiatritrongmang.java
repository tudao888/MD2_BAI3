import java.awt.*;
import java.util.Scanner;

public class timgiatritrongmang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arrName = new String[5];
        for (int i = 0; i < arrName.length; i++) {
            System.out.println("Nhap vao ten nguoi thu " + (i + 1));
             arrName[i] =scanner.nextLine();
        }
        System.out.println("Nhap vao ten hoc sinh");
        String name = scanner.nextLine();
        boolean check = false;
        for (int i = 0; i < arrName.length; i++) {
            if (arrName[i].equals(name)) {
                System.out.println("Sinh vien ten: " + name + "o vi tri thu: "+ i);
                check = true;
                break;
            }
            }
        if (check) {
            System.out.println("Sinh vien ten: " + name + " khong nam trong danh sach");
        }
            }
        }
