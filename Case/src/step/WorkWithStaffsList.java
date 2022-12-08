package step;

import combineAccountsAndStaffs.Account;
import combineAccountsAndStaffs.AccountList;
import combineAccountsAndStaffs.HashMapAccountsAndStaffs;
import combineAccountsAndStaffs.ListStaffs;

import java.text.ParseException;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class WorkWithStaffsList {
    public static void WorkWithStaffList() throws ParseException {
        Scanner input=new Scanner(System.in);
        while (true) {
            System.out.println("Các tùy chọn với danh sách nhân viên:");
            System.out.println("1. Thêm nhân viên mới vào vào danh sách");
            System.out.println("2. Xóa nhân viên khỏi danh sách");
            System.out.println("3. Sửa thông tin nhân viên");
            System.out.println("4. Lọc danh sách nhân viên theo bậc lương");
            System.out.println("5. Tìm kiếm nhân viên");
            System.out.println("6. Tra cứu tài khoản của nhân viên");
            System.out.println("7. Trở về");
            System.out.println("Hãy nhập lựa chọn của bạn:");
            int choice=Integer.parseInt(input.nextLine());
            switch (choice){
                case 1:
                    ListStaffs.addStaffs();
                    System.out.println("Tạo tài khoản cho nhân viên mới");
                    AccountList.addAccount();
                    break;
                case 2:
                    EditStaffs.removeStaff();
                    break;
                case 3:
                    EditStaffs.editStaff();
                    break;
                case 4:
                    FilterAndFind.filter();
                    break;
                case 5:
                    FilterAndFind.search();
                    break;
                case 6:
                    System.out.println("Nhập vào ID của nhân viên cần tra cứu tài khoản");
                    int id=Integer.parseInt(input.nextLine())-1;
                    System.out.println("Thông tin tài khoản của nhân viên cần tra là:");
                    System.out.println(HashMapAccountsAndStaffs.combineAccountsAndStaffs.entrySet().stream().filter(entry ->entry.getValue().equals(ListStaffs.StaffsOriginal.get(id))).map(entry -> entry.getKey()).collect(Collectors.toList()));
                    break;
                case 7:
                    LogedinByAdministrator.LogedinByAministrator();
                    break;
            }
        }
    }
}
