package combineAccountsAndStaffs;

import java.io.Serializable;

public class Account implements Serializable {
    String id;
    String passWord;

    public Account(String id, String passWord) {
        this.id = id;
        this.passWord = passWord;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    @Override
    public String toString() {
        return "CombineAccountsAndStaffs.Account{" +
                "id='" + id + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }
}
