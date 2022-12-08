package step;

import java.util.Scanner;

public class FirstScanScreen {
    static Scanner input = new Scanner(System.in);

    public static void firstScreen() {
        boolean start = true;
        while (start) {
            System.out.println("Quản lý nhân viên");
            System.out.println("Vui lòng đăng nhập để sử dụng");
            System.out.println("1. Đăng nhập");
            System.out.println("2. Thoát");
            System.out.println("Hãy nhập lựa chọn của bạn:");
            int choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    Login.signIn();
                    while (!Login.success && !Login.admin) {
                        System.out.println("Đăng nhập không thành công, vui lòng đăng nhập lại");
                        Login.signIn();
                    }
                    if (Login.changedPassword) start = true;
                    if (Login.success || Login.admin) start = false;
                    break;
                case 2:
                    start = false;
                    break;
            }
        }
    }
}