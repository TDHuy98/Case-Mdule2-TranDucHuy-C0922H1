package combineAccountsAndStaffs;

import java.util.HashMap;
import java.util.Map;

public class HashMapAccountsAndStaffs {
    public static Map<Account, Staff> combineAccountsAndStaffs = new HashMap<Account, Staff>();

    public static void combineAccountsAndStaffs() {
        if (ListStaffs.StaffsOriginal.size() > 0) {
            for (int i = 0; i < ListStaffs.StaffsOriginal.size(); i++) {
                combineAccountsAndStaffs.put(AccountList.accountListOriginal.get(i), ListStaffs.StaffsOriginal.get(i));
            }
        }
    }


    public static void showCombinedAccountsAndStaffs() {
        for (Object objectName : combineAccountsAndStaffs.keySet()) {
            System.out.println(objectName);
            System.out.println(combineAccountsAndStaffs.get(objectName));
        }
    }
}
