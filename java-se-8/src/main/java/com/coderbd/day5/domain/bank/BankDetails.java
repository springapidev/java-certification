package com.coderbd.day5.domain.bank;

/**
 *
 * @author Instructor
 */
public class BankDetails {

    //id, accounHolder, accountNo, bankName
    private int id;
    private String accounHolder;
    private long accountNo;
    private Bank bankName;

    public BankDetails() {
    }

    public BankDetails(int id, String accounHolder, long accountNo, Bank bankName) {
        this.id = id;
        this.accounHolder = accounHolder;
        this.accountNo = accountNo;
        this.bankName = bankName;
    }

    public int getId() {
        return id;
    }

    public String getAccounHolder() {
        return accounHolder;
    }

    public long getAccountNo() {
        return accountNo;
    }

    public Bank getBankName() {
        return bankName;
    }

}
