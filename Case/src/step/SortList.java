package step;

import combineAccountsAndStaffs.Staff;

import java.util.List;
import java.util.Scanner;

public class SortList {
    static Scanner input = new Scanner(System.in);

    public  void SortList() {
        List<Staff> SortedList = null;
        boolean sorting = true;
        while (sorting) {
            System.out.println("1. Sắp xếp danh sách theo tên (tăng dần)");
            System.out.println("2. Sắp xếp danh sách theo tên (giảm dần)");
            System.out.println("3. Sắp xếp danh sách theo giới tính (nam->nữ)");
            System.out.println("4. Sắp xếp danh sách theo giới tính (nữ->nam)");
            System.out.println("5. Sắp xếp danh sách theo lương (tăng dần)");
            System.out.println("6. Sắp xếp danh sách theo lương (giảm dần)");
            System.out.println("7. Sắp xếp danh sách theo tuổi (tăng dần)");
            System.out.println("8. Sắp xếp danh sách theo tuổi (giảm dần)");
            System.out.println("9. Sắp xếp danh sách theo số thứ tự (tăng dần)");
            System.out.println("10. Sắp xếp danh sách theo số thứ tự (giảm dần)");
            System.out.println("11. Sắp xếp danh sách theo số thuế thu nhập cá nhân (tăng dần)");
            System.out.println("12. Sắp xếp danh sách theo số thuế thu nhập cá nhân (giảm dần)");
            System.out.println("Hãy nhập vào lựa chọn của bạn");
            int choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    SortedList = StaffsListWorking.sortedStaffsListByName;
                    StaffsListWorking.showListOfStaffs(SortedList);
                    break;
                case 2:
                    SortedList = StaffsListWorking.sortedStaffsListByNameDecending;
                    StaffsListWorking.showListOfStaffs(SortedList);
                    break;
                case 3:
                    SortedList = StaffsListWorking.sortedStaffsListByGender;
                    StaffsListWorking.showListOfStaffs(SortedList);
                    break;
                case 4:
                    SortedList = StaffsListWorking.sortedStaffsListByGenderReverse;
                    StaffsListWorking.showListOfStaffs(SortedList);
                    break;
                case 5:
                    SortedList = StaffsListWorking.sortedStaffsListBySalary;
                    StaffsListWorking.showListOfStaffs(SortedList);
                    break;
                case 6:
                    SortedList = StaffsListWorking.sortStaffsListBySalaryDecending();
                    StaffsListWorking.showListOfStaffs(SortedList);
                    break;
                case 7:
                    SortedList = StaffsListWorking.sortedStaffsListByAge;
                    StaffsListWorking.showListOfStaffs(SortedList);
                    break;
                case 8:
                    SortedList = StaffsListWorking.sortedStaffsListByAgeDecending();
                    StaffsListWorking.showListOfStaffs(SortedList);
                    break;
                case 9:
                    SortedList = StaffsListWorking.sortedStaffsListByIndex;
                    StaffsListWorking.showListOfStaffs(SortedList);
                    break;
                case 10:
                    SortedList = StaffsListWorking.sortedStaffsListByIndexDecending();
                    StaffsListWorking.showListOfStaffs(SortedList);
                    break;
                case 11:
                    SortedList = StaffsListWorking.sortedStaffsListByTax;
                    StaffsListWorking.showListOfStaffs(SortedList);
                    break;
                case 12:
                    SortedList = StaffsListWorking.sortStaffsListByTaxDecending();
                    StaffsListWorking.showListOfStaffs(SortedList);
                    break;
                default:
                    break;
            }
        }

    }
}
