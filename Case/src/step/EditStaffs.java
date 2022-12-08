package step;

import combineAccountsAndStaffs.AccountList;
import combineAccountsAndStaffs.ListStaffs;

import java.text.ParseException;
import java.util.Scanner;

public class EditStaffs {
    static Scanner input = new Scanner(System.in);

    public static void editStaff() throws ParseException {
        System.out.println("Nhập vào ID của nhân viên muốn sửa thông tin:");
        int editID = Integer.parseInt(input.nextLine())-1;
        System.out.println("Hãy chọn thông tin muốn sửa của nhân viên đó:");
        System.out.println("1. Sửa tên");
        System.out.println("2. Sửa giới tính");
        System.out.println("3. Sửa ngày tháng năm sinh");
        System.out.println("4. Sửa lương");
        System.out.println("5. Sửa số người phụ thuộc");
        System.out.println("6. Đổi mật khẩu tài khoản của nhân viên");
        System.out.println("7. Trở về");
        int choice = Integer.parseInt(input.nextLine());
        switch (choice) {
            case 1:
                System.out.println("Hãy nhập vào tên mới cho nhân viên:");
                ListStaffs.changeName(ListStaffs.StaffsOriginal.get(editID));
                System.out.println(ListStaffs.StaffsOriginal.get(editID));
                break;
            case 2:
                System.out.println("Hãy nhập vào giới tính mới cho nhân viên:");
                ListStaffs.changeGender(ListStaffs.StaffsOriginal.get(editID));
                System.out.println(ListStaffs.StaffsOriginal.get(editID));
                break;
            case 3:
                System.out.println("Hãy nhập vào ngày tháng năm sinh mới cho nhân viên:");
                ListStaffs.changeDob(ListStaffs.StaffsOriginal.get(editID));
                System.out.println(ListStaffs.StaffsOriginal.get(editID));
                break;
            case 4:
                System.out.println("Hãy nhập vào lương mới cho nhân viên:");
                ListStaffs.changeSalary(ListStaffs.StaffsOriginal.get(editID));
                System.out.println(ListStaffs.StaffsOriginal.get(editID));
                break;
            case 5:
                System.out.println("Hãy nhập vào số người phụ thuộc mới cho nhân viên:");
                ListStaffs.changeNumbersOfDependence(ListStaffs.StaffsOriginal.get(editID));
                System.out.println(ListStaffs.StaffsOriginal.get(editID));
                break;
            case 7:
                WorkWithStaffsList.WorkWithStaffList();
                break;
        }
    }
    public static void removeStaff(){
        System.out.println("Hãy nhập vào ID của nhân viên muốn xóa");
        int removeID=Integer.parseInt(input.nextLine());
        ListStaffs.delete(removeID);
        AccountList.deleteAccount(removeID);

    }
}
