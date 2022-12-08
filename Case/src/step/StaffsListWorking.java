package step;

import combineAccountsAndStaffs.ListStaffs;
import combineAccountsAndStaffs.Staff;

import java.util.*;
import java.util.stream.Collectors;

public class StaffsListWorking implements Comparable {
    static Scanner input = new Scanner(System.in);
    //make a list clone of StaffsOriginal;
    public static List<Staff> StaffsList = ListStaffs.StaffsOriginal;
    //Sort clone list by attribute
    public static List<Staff> sortedStaffsListByName = StaffsList.stream().sorted((s1, s2) -> s1.getName().compareToIgnoreCase(s2.getName())).collect(Collectors.toList());
    public static List<Staff> sortedStaffsListByNameDecending = StaffsList.stream().sorted((s1, s2) -> s2.getName().compareToIgnoreCase(s1.getName())).collect(Collectors.toList());
    public static List<Staff> sortedStaffsListByIndex = StaffsList.stream().sorted(Comparator.comparing(Staff::getId)).collect(Collectors.toList());

    public static List<Staff> sortedStaffsListByIndexDecending() {
        List<Staff> sortedStaffsListByIndexDecending = new java.util.ArrayList<>(List.copyOf(sortedStaffsListByIndex));
        Collections.reverse(sortedStaffsListByIndexDecending);
        return sortedStaffsListByIndexDecending;
    }

    public static List<Staff> sortedStaffsListBySalary = StaffsList.stream().sorted(Comparator.comparing(Staff::getSalary)).collect(Collectors.toList());

    public static List<Staff> sortStaffsListBySalaryDecending() {
        List<Staff> sortedStaffsListBySalaryDecending = new java.util.ArrayList<>(List.copyOf(sortedStaffsListBySalary));
        Collections.reverse(sortedStaffsListBySalaryDecending);
        return sortedStaffsListBySalaryDecending;
    }

    public static List<Staff> sortedStaffsListByTax = StaffsList.stream().sorted(Comparator.comparing(Staff::getTax)).collect(Collectors.toList());


    public static List<Staff> sortStaffsListByTaxDecending() {
        List<Staff> sortedStaffsListByTaxDecending = new java.util.ArrayList<>(List.copyOf(sortedStaffsListByTax));
        Collections.reverse(sortedStaffsListByTaxDecending);
        return sortedStaffsListByTaxDecending;
    }

    public static List<Staff> sortedStaffsListByAge = StaffsList.stream().sorted(Comparator.comparing(Staff::getAge)).collect(Collectors.toList());

    public static List<Staff> sortedStaffsListByAgeDecending() {
        return new ArrayList<>(List.copyOf(sortedStaffsListByAge));
    }

    public static List<Staff> sortedStaffsListByGender = StaffsList.stream().sorted((s1, s2) -> s1.getGender().compareToIgnoreCase(s2.getGender())).collect(Collectors.toList());
    public static List<Staff> sortedStaffsListByGenderReverse = StaffsList.stream().sorted((s1, s2) -> s2.getGender().compareToIgnoreCase(s1.getGender())).collect(Collectors.toList());

    //Filter clone list
    public static List<Staff> filterBySalaryTier1 = StaffsList.stream().filter(staff -> staff.getSalary() <= 5000000).collect(Collectors.toList());
    public static List<Staff> filterBySalaryTier2 = StaffsList.stream().filter(staff -> staff.getSalary() > 5000000 && staff.getSalary() <= 10000000).collect(Collectors.toList());
    public static List<Staff> filterBySalaryTier3 = StaffsList.stream().filter(staff -> staff.getSalary() > 10000000 && staff.getSalary() <= 18000000).collect(Collectors.toList());
    public static List<Staff> filterBySalaryTier4 = StaffsList.stream().filter(staff -> staff.getSalary() > 18000000 && staff.getSalary() <= 32000000).collect(Collectors.toList());
    public static List<Staff> filterBySalaryTier5 = StaffsList.stream().filter(staff -> staff.getSalary() > 32000000 && staff.getSalary() <= 52000000).collect(Collectors.toList());
    public static List<Staff> filterBySalaryTier6 = StaffsList.stream().filter(staff -> staff.getSalary() > 52000000 && staff.getSalary() <= 80000000).collect(Collectors.toList());
    public static List<Staff> filterBySalaryTier7 = StaffsList.stream().filter(staff -> staff.getSalary() > 80000000).collect(Collectors.toList());

    public static List<Staff> searchByName() {
        System.out.println("Nhập vào tên muốn tìm");
        String findName = input.nextLine();
        return StaffsList.stream().filter(staff -> staff.getFullname().contains(findName)).collect(Collectors.toList());
    }
    public static List<Staff> searchByDob() {
        System.out.println("Nhập vào ngày tháng năm sinh muốn tìm");
        String findDob = null;
        while (findDob == null) {
            try {
                System.out.println("Nhập vào ngày tháng năm sinh (theo định dạng dd/MM/yyyy):");
                findDob = input.next("\\d{2}/\\d{2}/\\d{4}");

            } catch (Exception e) {
                // ignore old input
            } finally {
                input.nextLine();
            }
        }
        String finalFindDob = findDob;
        return StaffsList.stream().filter(staff -> Objects.equals(staff.getDob(), finalFindDob)).collect(Collectors.toList());
    }
    public static List<Staff> searchByAge() {
        System.out.println("Nhập vào tuổi muốn tìm");
        int findAge = Integer.parseInt(input.nextLine());
        return StaffsList.stream().filter(staff -> staff.getAge()==(findAge)).collect(Collectors.toList());
    }

    public static List<Staff> searchBySalary() {
        System.out.println("Nhập vào lương muốn tìm");
        double findSalary = Double.parseDouble(input.nextLine());
        return StaffsList.stream().filter(staff -> staff.getSalary() == findSalary).collect(Collectors.toList());
    }

    public static List<Staff> searchByNumbersOfDependency() {
        System.out.println("Nhập vào số người phụ thuộc muốn tìm");
        int findNumbersOfDependency = Integer.parseInt(input.nextLine());
        return StaffsList.stream().filter(staff -> staff.getNumbersOfDepended() == findNumbersOfDependency).collect(Collectors.toList());
    }

    public static void showListOfStaffs(List<Staff> List) {
        for (Staff staff : List
        ) {
            System.out.println(staff);
        }
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
