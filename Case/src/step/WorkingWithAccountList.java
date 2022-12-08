package step;

import combineAccountsAndStaffs.AccountList;

import java.text.ParseException;
import java.util.Scanner;

public class WorkingWithAccountList {
    static Scanner input = new Scanner(System.in);

    public static void workingWithAccountList() throws ParseException {
        while (true) {
            System.out.println("1. Đổi mật khẩu của tài khoản nhân viên");
            System.out.println("2. Trở về");
            System.out.println("Hãy nhập vào lựa chọn của bạn");
            int choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Nhập vào ID của nhân viên muốn đổi mật khẩu");
                    int id = Integer.parseInt(input.nextLine());
                    AccountList.changePassword(AccountList.accountListOriginal.get(id));
                    System.out.println("Đổi mật khẩu thành công");
                    break;
                case 2:
                    LogedinByAdministrator.LogedinByAministrator();
                    break;
            }
        }
    }
}
