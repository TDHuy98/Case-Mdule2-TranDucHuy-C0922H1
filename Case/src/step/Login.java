package step;

import ReadAndWriteFile.ReadAndWriteAccountdata;
import combineAccountsAndStaffs.Account;
import combineAccountsAndStaffs.AccountList;
import combineAccountsAndStaffs.HashMapAccountsAndStaffs;
import combineAccountsAndStaffs.ListStaffs;

import java.lang.NumberFormatException;
import java.util.Objects;
import java.util.Scanner;

public class Login {
    public static boolean success = false;
    public static boolean admin = false;
    public static boolean changedPassword = false;


    public static void signIn() {
        Scanner input = new Scanner(System.in);
        String id;
        String password;
        if (ListStaffs.StaffsOriginal.size() == 0) {
            System.out.println("Vui lòng đăng nhập lần đầu với cấp quản lý");
            System.out.println("Nhập vào tên đăng nhập:");
            id = input.nextLine();
            System.out.println("Nhập vào password:");
            password = input.nextLine();
            if (Objects.equals(AccountList.administratorAccount.getId(), id) && Objects.equals(AccountList.administratorAccount.getPassWord(), password)) {
                admin = true;
                success = true;
                System.out.println("Đăng nhập thành công với cấp độ quản lý");
            }
        } else {
            System.out.println("Nhập vào tên đăng nhập:");
            id = input.nextLine();
            System.out.println("Nhập vào password:");
            password = input.nextLine();

            for (Account account : AccountList.accountListOriginal) {
                if (Objects.equals(account.getId(), id) && Objects.equals(account.getPassWord(), password)) {
                    System.out.println("Đăng nhập thành công với cấp độ nhân viên");
                    System.out.println("Thông tin cá nhân của bạn:");
                    System.out.println(HashMapAccountsAndStaffs.combineAccountsAndStaffs
                            .get(AccountList.accountListOriginal
                                    .get(AccountList.accountListOriginal.indexOf(account))));
                    System.out.println("Bạn có muốn:");
                    System.out.println("1. Đổi mật khẩu");
                    System.out.println("2. Trở về");
                    System.out.println("Nhập lựa chọn của bạn:");
                    int choice = Integer.parseInt(input.nextLine());

                    switch (choice) {
                        case 1:
                            AccountList.changePassword(AccountList.accountListOriginal
                                    .get(AccountList.accountListOriginal.indexOf(account)));
                            System.out.println("Đổi mật khẩu thành công");
                            System.out.println("Vui lòng đăng nhập lại");
                            FirstScanScreen.firstScreen();
                            break;
                        case 2:
                            FirstScanScreen.firstScreen();
                            break;
                    }
                    success = true;
                    admin = false;
                }
            }
            if (Objects.equals(AccountList.administratorAccount.getId(), id) && Objects.equals(AccountList.administratorAccount.getPassWord(), password)) {
                admin = true;
                success = true;
                System.out.println("Đăng nhập thành công với cấp độ quản lý");
            }
        }
    }

}
