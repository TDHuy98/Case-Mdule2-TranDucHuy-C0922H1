package ReadAndWriteFile;

import combineAccountsAndStaffs.Account;
import combineAccountsAndStaffs.AccountList;
import combineAccountsAndStaffs.ListStaffs;
import combineAccountsAndStaffs.Staff;

import java.io.*;
import java.util.List;

public class ReadAndWriteAccountdata {
    public static void writeToFile() {
        try {
            FileOutputStream writeData = new FileOutputStream("accountdata.ser");
            ObjectOutputStream writeStream = new ObjectOutputStream(writeData);

            writeStream.writeObject(AccountList.accountListOriginal);
            writeStream.flush();
            writeStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Account> read() {
        List<Account> accountList2 = null;
        try {
            FileInputStream readData = new FileInputStream("accountdata.ser");
            ObjectInputStream readStream = new ObjectInputStream(readData);

            accountList2 = (List<Account>) readStream.readObject();
            readStream.close();
            System.out.println("Đọc file accountdata thành công");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return accountList2;
    }
}
