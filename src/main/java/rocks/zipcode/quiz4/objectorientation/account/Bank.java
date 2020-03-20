package rocks.zipcode.quiz4.objectorientation.account;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 27/12/2018.
 */
public class Bank {

    List<BankAccount> bankAccounts = new ArrayList<>();

    public BankAccount removeBankAccountByIndex(Integer indexNumber) {
        BankAccount toReturn = bankAccounts.get(indexNumber);
        for (int i = 0; i < bankAccounts.size(); i++) {
            if (i == indexNumber) {
                bankAccounts.remove(i);
            }
        }
        return toReturn;
    }

    public void addBankAccount(BankAccount bankAccount) {
        bankAccounts.add(bankAccount);
    }

    public Boolean containsBankAccount(BankAccount bankAccount) {
        for (BankAccount account : bankAccounts) {
            if (account == bankAccount) {
                return true;
            }
        }
        return false;
        //throw new UnsupportedOperationException("Method not yet implemented");
    }
}
