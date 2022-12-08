import ReadAndWriteFile.ReadAndWriteAccountdata;
import combineAccountsAndStaffs.Account;
import combineAccountsAndStaffs.AccountList;
import combineAccountsAndStaffs.HashMapAccountsAndStaffs;
import step.FirstScanScreen;
import step.LogedinByAdministrator;
import combineAccountsAndStaffs.ListStaffs;
import step.WorkWithStaffsList;

import java.io.FileNotFoundException;
import javax.management.BadStringOperationException;
import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws FileNotFoundException, ParseException, IOException, BadStringOperationException, InterruptedException {
        ListStaffs listStaffs = new ListStaffs();
        AccountList accountList=new AccountList();
//        AccountList.accountListOriginal.add(new Account("NHH1984","5"));
//        ReadAndWriteAccountdata.writeToFile();
        //Thực hiện ghép tài khoản và nhân viên tương ứng
        HashMapAccountsAndStaffs.combineAccountsAndStaffs();

//        ListStaffs.StaffsOriginal.add(new Staff("Trần Đức Huy", "nam", "12/06/1998", 24, 4000000, 0));
//        ListStaffs.StaffsOriginal.add(new Staff("Nguyễn Hoài An", "nữ", "12/12/1999", 23, 8000000, 0));
//        ListStaffs.StaffsOriginal.add(new Staff("Nguyễn Thu Hà", "nam", "22/02/1993", 29, 39000000, 2));
//        ListStaffs.StaffsOriginal.add(new Staff("Nguyễn Văn Nam", "nam", "09/09/1996", 26, 19000000, 1));
//        ListStaffs.showListOfStaffsOriginal();
//        AccountList.accountListOriginal.add(new Account("TDH1998", "1"));
//        AccountList.accountListOriginal.add(new Account("NHA1999", "2"));
//        AccountList.accountListOriginal.add(new Account("NTH1993", "3"));
//        AccountList.accountListOriginal.add(new Account("NVN1996", "4"));
//        ReadAndWriteAccountdata.writeToFile();
//

//        AccountList.showAccountList();
//        Running.SortList.Running.SortList();
////main
//        HashMapAccountsAndStaffs.showCombinedAccountsAndStaffs();

//        System.out.println(HashMapAccountsAndStaffs.combineAccountsAndStaffs.size());
        Scanner input = new Scanner(System.in);
        FirstScanScreen.firstScreen();
        LogedinByAdministrator.LogedinByAministrator();
        WorkWithStaffsList.WorkWithStaffList();
//        HashMapAccountsAndStaffs.combineAccountsAndStaffs();
//    }
//}

//        CombineAccountsAndStaffs.ListStaffs.addStaffs();
//        CombineAccountsAndStaffs.ListStaffs.showListOfStaffsOriginal();
//        CombineAccountsAndStaffs.ListStaffs.showListOfStaffsOriginal();
//        System.out.println("sorted by tax");
//        Running.StaffsListWorking.showListOfStaffs(Running.StaffsListWorking.sortedStaffsListByTax);
//        System.out.println("sorted by name");
//        Running.StaffsListWorking.showListOfStaffs(Running.StaffsListWorking.sortedStaffsListByName);
//        sortedStaffsListByNameSystem.out.println("sorted by age");
//        Running.StaffsListWorking.showListOfStaffs(Running.StaffsListWorking.sortedStaffsListByAge);
//        System.out.println("sorted by id");
//        Running.StaffsListWorking.showListOfStaffs(Running.StaffsListWorking.sortedStaffsListByIndex);
//        System.out.println("by tax dowm");
//        Running.StaffsListWorking.showListOfStaffs(Running.StaffsListWorking.sortStaffsListByTaxDecending());
//
//        System.out.println("sorted by tax");
//        Running.StaffsListWorking.showListOfStaffs(Running.StaffsListWorking.sortedStaffsListByTax);
//        System.out.println("filter tier 1");+
//        Running.StaffsListWorking.showListOfStaffs(Running.StaffsListWorking.filterBySalaryTier7);
//        try {
//            Running.EditStaffs.editStaff();
//
//        } catch (Exception e) {
//        } finally {
//            Running.EditStaffs.editStaff();
//
    }
//    }

}
