package combineAccountsAndStaffs;

import ReadAndWriteFile.ReadAndWriteStaffdata;

import java.io.IOException;
import java.io.Serializable;
import java.text.ParseException;
import java.time.Year;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ListStaffs implements Serializable {

    static Scanner input = new Scanner(System.in);

    public static List<Staff> StaffsOriginal;

    static {
        try {
            StaffsOriginal = ReadAndWriteStaffdata.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void addStaffs() throws ParseException {
        System.out.println("Nhập vào tên nhân viên:");
        String name = input.nextLine();
        System.out.println("Nhập vào giới tính:");
        String gender = input.nextLine();

        String dob = null;
        while (dob == null) {
            try {
                System.out.println("Nhập vào ngày tháng năm sinh (theo định dạng dd/MM/yyyy):");
                dob = input.next("\\d{2}/\\d{2}/\\d{4}");

            } catch (Exception e) {
                // ignore old input
            } finally {
                input.nextLine();
            }
        }
        Matcher m = Pattern.compile("\\d{4}").matcher(dob);
        String year = null;
        while (m.find()) {
            year = m.group(0);
        }

        int age = Year.now().getValue() - Integer.parseInt(year);
        System.out.println("Nhập vào số lương một tháng");
        double salary = Double.parseDouble(input.nextLine());
        System.out.println("Số người phụ thuộc:");
        int soNguoiPhuThuoc = Integer.parseInt(input.nextLine());
        StaffsOriginal.add(new Staff(name, gender, dob, age, salary, soNguoiPhuThuoc));
        ReadAndWriteStaffdata.writeToFile();

    }

    public static List<Staff> delete(int index) {
        StaffsOriginal.remove(index);
        return StaffsOriginal;
    }

    public static void showListOfStaffsOriginal() {
        for (Staff staff : StaffsOriginal
        ) {
            System.out.println(staff);
        }
    }

    public static Staff changeName(Staff staffWantToChangeName) {
        System.out.println("Nhập vào tên mới của nhân viên:");
        String newName = input.nextLine();
        staffWantToChangeName.setName(newName);
        HashMapAccountsAndStaffs.combineAccountsAndStaffs();

        return staffWantToChangeName;
    }

    public static Staff changeDob(Staff staffWantToChangeDob) {
        String newDob = null;
        while (newDob == null) {
            try {
                System.out.println("Nhập vào ngày tháng năm sinh (theo định dạng dd/MM/yyyy):");
                newDob = input.next("\\d{2}/\\d{2}/\\d{4}");

            } catch (Exception e) {
                // ignore old input
            } finally {
                input.nextLine();
            }
        }
        Matcher m = Pattern.compile("\\d{4}").matcher(newDob);
        String year = null;
        while (m.find()) {
            year = m.group(0);
        }

        int newAge = Year.now().getValue() - Integer.parseInt(year);
        staffWantToChangeDob.setDob(newDob);
        staffWantToChangeDob.setAge(newAge);
        HashMapAccountsAndStaffs.combineAccountsAndStaffs();

        return staffWantToChangeDob;
    }

    public static Staff changeGender(Staff staffWantToChangeGender) {
        System.out.println("Nhập vào giới tính của nhân viên");
        String newGender = input.nextLine();
        staffWantToChangeGender.setGender(newGender);
        HashMapAccountsAndStaffs.combineAccountsAndStaffs();

        return staffWantToChangeGender;
    }

    public static Staff changeSalary(Staff staffWantToChangeSalary) {
        System.out.println("Nhập vào lương mới của nhân viên:");
        double newSalary = Double.parseDouble(input.nextLine());
        staffWantToChangeSalary.setSalary(newSalary);
        HashMapAccountsAndStaffs.combineAccountsAndStaffs();

        return staffWantToChangeSalary;
    }

    public static Staff changeNumbersOfDependence(Staff staffWantToChangeNumbersOfDependence) {
        System.out.println("Nhập vào số người phụ thuộc mới của nhân viên:");
        String newNumbersOfDependence = input.nextLine();
        staffWantToChangeNumbersOfDependence.setName(newNumbersOfDependence);
        HashMapAccountsAndStaffs.combineAccountsAndStaffs();

        return staffWantToChangeNumbersOfDependence;
    }

}

