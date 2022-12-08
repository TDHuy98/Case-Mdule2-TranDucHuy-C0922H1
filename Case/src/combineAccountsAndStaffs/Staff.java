package combineAccountsAndStaffs;

import somethingsElse.VNCharacterUtils;

import java.io.Serializable;

public class Staff implements Serializable {

    private String fullname;
    private String gender;
    private String dob;
    private int age;
    private double salary;
    private int numbersOfDepended;
    private int id;

    public Staff(String fullname, String gender, String dob, int age, double salary, int numbersOfDepended) {
        this.fullname = fullname;
        this.gender = gender;
        this.dob = dob;
        this.age = age;
        this.salary = salary;
        this.numbersOfDepended = numbersOfDepended;
    }

    {
        if (ListStaffs.StaffsOriginal.size() == 0) {
            this.id = 1;
        } else this.id = (ListStaffs.StaffsOriginal.size() + 1);
    }

    public int getId() {
        return id;
    }


    public String getFullname() {
        return fullname;
    }

    public void setName(String fullname) {
        this.fullname = fullname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getNumbersOfDepended() {
        return numbersOfDepended;
    }

    public void setNumbersOfDepended(int numbersOfDepended) {
        this.numbersOfDepended = numbersOfDepended;
    }

    public String getName() {
        int index = this.fullname.lastIndexOf(" ");
        String LastName = VNCharacterUtils.removeAccent(this.fullname.substring(index + 1));
        return LastName;
    }

    public double tax() {
        double cacKhoanGiamTru = numbersOfDepended * 4400000 + 11000000;
        double thuNhapTinhThue = salary - cacKhoanGiamTru;
        double tax = 0;

        if (this.salary <= 11000000) {
            tax = 0;
        } else if (thuNhapTinhThue <= 5000000) {
            tax = thuNhapTinhThue * 0.05;
        } else if (5000000 < thuNhapTinhThue && thuNhapTinhThue <= 10000000) {
            tax = thuNhapTinhThue * 0.1;
        } else if (10000000 < thuNhapTinhThue && thuNhapTinhThue <= 18000000) {
            tax = thuNhapTinhThue * 0.15;
        } else if (18000000 < thuNhapTinhThue && thuNhapTinhThue <= 32000000) {
            tax = thuNhapTinhThue * 0.2;
        } else if (32000000 < thuNhapTinhThue && thuNhapTinhThue <= 52000000) {
            tax = thuNhapTinhThue * 0.25;
        } else if (52000000 < thuNhapTinhThue && thuNhapTinhThue <= 80000000) {
            tax = thuNhapTinhThue * 0.3;
        } else if (80000000 < thuNhapTinhThue) {
            tax = thuNhapTinhThue * 0.35;
        }
        return tax;
    }

    public double getTax() {
        return tax();
    }

    @Override
    public String toString() {
        return "Thông tin nhân viên :[" + "id='" + id + '\'' +
                ", tên: '" + fullname + '\'' + ", giới tính: '" + gender + '\'' + ", ngày tháng năm sinh: '" + dob + '\'' +
                ", tuổi: '" + age + '\'' +
                ", lương: '" + String.format("%.2f", salary) + '\'' + ", thuế thu nhập cá nhân: " + tax() + '\'' +
                ']';
    }

}
