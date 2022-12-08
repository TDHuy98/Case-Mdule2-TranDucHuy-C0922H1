package combineAccountsAndStaffs;

import ReadAndWriteFile.ReadAndWriteAccountdata;
import ReadAndWriteFile.ReadAndWriteStaffdata;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class AccountList implements Serializable {
    static Scanner input = new Scanner(System.in);
    public static final Account administratorAccount= new Account("Admin","Admin123");
    public static List<Account> accountListOriginal = ReadAndWriteAccountdata.read();


    public static void showAccountList() {
        for (Account account : accountListOriginal
        ) {
            System.out.println(account);
        }
    }

    public static void addAccount() {
        System.out.println("Hãy nhập vào ID cho tài khoản mới của nhân viên");
        String newID = input.nextLine();
        System.out.println("Hãy nhập vào password cho tài khoản mới của nhân viên");
        String newPassword = input.nextLine();
        accountListOriginal.add(new Account(newID, newPassword));
        ReadAndWriteAccountdata.writeToFile();
        HashMapAccountsAndStaffs.combineAccountsAndStaffs();

    }
    public static void deleteAccount(int index){
        accountListOriginal.remove(index);
        ReadAndWriteAccountdata.writeToFile();
        HashMapAccountsAndStaffs.combineAccountsAndStaffs();

    }

    public static void changePassword(Account account) {
        System.out.println("Nhập vào mật khẩu mới cho tài khoản");
        String newPassWord=input.nextLine();
        account.setPassWord(newPassWord);
        ReadAndWriteAccountdata.writeToFile();
        HashMapAccountsAndStaffs.combineAccountsAndStaffs();

    }
}
