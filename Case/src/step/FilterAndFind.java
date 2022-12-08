package step;

import combineAccountsAndStaffs.Staff;

import java.text.ParseException;
import java.util.List;
import java.util.Scanner;

public class FilterAndFind {
    static Scanner input = new Scanner(System.in);

    public static void filter() throws ParseException {
        System.out.println("Lọc danh sách nhân viên theo bậc lương");
        boolean filtering = true;
        while (filtering) {
            System.out.println("Hãy nhập vào lựa chọn bậc lương cần lọc");
            System.out.println("1. Lọc theo bậc 1 (<=5 triệu)");
            System.out.println("2. Lọc theo bậc 2 (5-10 triệu)");
            System.out.println("3. Lọc theo bậc 3 (10-18 triệu)");
            System.out.println("4. Lọc theo bậc 4 (18-32 triệu)");
            System.out.println("5. Lọc theo bậc 5 (32-52 triệu)");
            System.out.println("6. Lọc theo bậc 6 (52-80 triệu)");
            System.out.println("7. Lọc theo bậc 7 (>80 triệu)");
            System.out.println("8. Trở về");
            List<Staff> filtedListStaffsBySalary = null;
            int choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1 -> {
                    filtedListStaffsBySalary = StaffsListWorking.filterBySalaryTier1;
                    if (filtedListStaffsBySalary.size() == 0) {
                        System.out.println("Không có nhân viên có lương thuộc bậc 1");
                    } else {
                        System.out.println("Những nhân viên có lương thuộc bậc 1");

                        System.out.println(filtedListStaffsBySalary);
                    }
                }
                case 2 -> {
                    filtedListStaffsBySalary = StaffsListWorking.filterBySalaryTier2;
                    if (filtedListStaffsBySalary.size() == 0) {
                        System.out.println("Không có nhân viên có lương thuộc bậc 2");
                    } else {

                        System.out.println("Những nhân viên có lương thuộc bậc 2");

                        System.out.println(filtedListStaffsBySalary);
                    }
                }

                case 3 -> {
                    filtedListStaffsBySalary = StaffsListWorking.filterBySalaryTier3;
                    if (filtedListStaffsBySalary.size() == 0) {
                        System.out.println("Không có nhân viên có lương thuộc bậc 3");
                    } else {
                        System.out.println("Những nhân viên có lương thuộc bậc 3");

                        System.out.println(filtedListStaffsBySalary);
                    }
                }
                case 4 -> {
                    filtedListStaffsBySalary = StaffsListWorking.filterBySalaryTier4;
                    if (filtedListStaffsBySalary.size() == 0) {
                        System.out.println("Không có nhân viên có lương thuộc bậc 4");
                    } else {
                        System.out.println("Những nhân viên có lương thuộc bậc 4");

                        System.out.println(filtedListStaffsBySalary);
                    }
                }
                case 5 -> {
                    filtedListStaffsBySalary = StaffsListWorking.filterBySalaryTier5;
                    if (filtedListStaffsBySalary.size() == 0) {
                        System.out.println("Không có nhân viên có lương thuộc bậc 5");
                    } else {
                        System.out.println("Những nhân viên có lương thuộc bậc 5");

                        System.out.println(filtedListStaffsBySalary);
                    }
                }
                case 6 -> {
                    filtedListStaffsBySalary = StaffsListWorking.filterBySalaryTier6;
                    if (filtedListStaffsBySalary.size() == 0) {
                        System.out.println("Không có nhân viên có lương thuộc bậc 6");
                    } else {
                        System.out.println("Những nhân viên có lương thuộc bậc 6");

                        System.out.println(filtedListStaffsBySalary);
                    }
                }
                case 7 -> {
                    filtedListStaffsBySalary = StaffsListWorking.filterBySalaryTier7;
                    if (filtedListStaffsBySalary.size() == 0) {
                        System.out.println("Không có nhân viên có lương thuộc bậc 7");
                    } else {
                        System.out.println("Những nhân viên có lương thuộc bậc 7");

                        System.out.println(filtedListStaffsBySalary);
                    }
                }
                case 8 -> WorkWithStaffsList.WorkWithStaffList();
            }
        }

    }

    public static void search() throws ParseException {
        System.out.println("Tìm kiếm");
        boolean searching = true;
        while (searching) {
            System.out.println("Hãy nhập vào lựa chọn của bạn:");
            System.out.println("1. Tìm kiếm theo tên nhân viên");
            System.out.println("2. Tìm kếm theo lương");
            System.out.println("3. Tìm kiếm theo tuổi");
            System.out.println("4. Tìm kiếm theo ngày tháng năm sinh");
            System.out.println("5. Tìm kiếm theo số người phụ thuộc");
            System.out.println("6. Trở về");
            int choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    List<Staff> searchedByName = StaffsListWorking.searchByName();
                    if (searchedByName.size() == 0) {
                        System.out.println("Không có nhâ viên có tên tương ứng");
                    } else
                        System.out.println(searchedByName);
                    break;
                case 2:
                    List<Staff> searchedBySalary = StaffsListWorking.searchBySalary();
                    if (searchedBySalary.size() == 0) {
                        System.out.println("Không có nhân viên nào có lương bằng mức lương đã nhập");
                    } else
                        System.out.println(searchedBySalary);
                    break;
                case 3:
                    List<Staff> searchedByAge = StaffsListWorking.searchByAge();
                    if (searchedByAge.size() == 0) {
                        System.out.println("Không có nhân viên nào có tuổi bằng với tuổi đã nhập");
                    } else
                        System.out.println(searchedByAge);
                    break;
                case 4:
                    List<Staff> searchedByDob = StaffsListWorking.searchByDob();
                    if (searchedByDob.size() == 0) {
                        System.out.println("Không có nhân viên nào có ngày tháng năm sinh tương ứng");
                    } else
                        System.out.println();
                    break;
                case 5:
                    List<Staff> searchedByNumberDependency = StaffsListWorking.searchByNumbersOfDependency();
                    if (searchedByNumberDependency.size() == 0) {
                        System.out.println("Không có nhân viên nào có số người phụ thuộc tương ứng");
                    } else
                        System.out.println(searchedByNumberDependency);
                case 6:
                    WorkWithStaffsList.WorkWithStaffList();
                    break;
            }
        }
    }
}
