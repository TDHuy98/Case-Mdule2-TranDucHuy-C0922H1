package step;

import combineAccountsAndStaffs.AccountList;
import combineAccountsAndStaffs.HashMapAccountsAndStaffs;
import combineAccountsAndStaffs.ListStaffs;

import java.text.ParseException;
import java.util.Scanner;

public class LogedinByAdministrator {
    static Scanner input=new Scanner(System.in);
    public static void LogedinByAministrator() throws ParseException {
        if (Login.admin && Login.success) {
            System.out.println("Chào mừng đến với quản lý danh sách nhân viên");
            System.out.println("Danh sách tính năng:");
            System.out.println("1. Hiển thị danh sách nhân viên");
            System.out.println("2. Hiển thị danh sách tài khoản của nhân viên");
            System.out.println("3. Trở về");
            System.out.println("Hãy nhập vào lựa chọn của bạn:");
            int choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    if (ListStaffs.StaffsOriginal.size() == 0) {
                        System.out.println("Danh sách hiện đang trống, vui lòng thêm nhân viên vào danh sách");
                        ListStaffs.addStaffs();
                        System.out.println("Tạo tài khoản cho nhân viên mới");
                        AccountList.addAccount();
                        System.out.println("Danh sách nhân viên:");
                        ListStaffs.showListOfStaffsOriginal();
                        System.out.println("1. Thêm nhân viên vào danh sách");
                        System.out.println("2. Sắp xếp danh sách");
                        System.out.println("3. Sửa thông tin nhân viên");
                    } else {
                        System.out.println("Danh sách nhân viên:");
                        ListStaffs.showListOfStaffsOriginal();

                        WorkWithStaffsList.WorkWithStaffList();
                    }
                    break;
                case 2:
                    if (AccountList.accountListOriginal.size() == 0) {
                        System.out.println("Danh sách hiện đang trống, vui lòng thêm nhân viên vào danh sách");
                        ListStaffs.addStaffs();
                        System.out.println("Danh sách nhân viên:");
                        ListStaffs.showListOfStaffsOriginal();
                        System.out.println("Tạo tài khoản cho nhân viên vừa thêm:");
                        AccountList.addAccount();
                        System.out.println("Danh sách tài khoản");
                        AccountList.showAccountList();
                        System.out.println("Các thao tác có thể làm với danh sách nhân viên");
                        System.out.println("1. Đổi mật khẩu của tài khoản nhân viên");
                        System.out.println("2. Trở về");
                    } else {
                        System.out.println("Danh sách tài khoản:");
                        HashMapAccountsAndStaffs.showCombinedAccountsAndStaffs();
                        System.out.println("Các thao tác có thể làm với danh sách nhân viên");
                        WorkingWithAccountList.workingWithAccountList();
                        break;
                    }
                    break;
                case 3:
                    FirstScanScreen.firstScreen();
                    break;
            }
        }
    }
}
