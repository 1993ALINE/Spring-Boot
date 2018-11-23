package com.example.model;
import java.util.Map;

public class BankAccount {
    private String bankName="";
    private String accountNo="";
    private String accountTitle="";
    private String mobileNo="";
    private String bankCode="";
    private String branchCode="";
    private String branchName="";
    Map<String,String> mapValue;
    Map<String,String> mainMapValue;
    Map<String,String> bankMapValue;

    public Map<String, String> getBankMapValue() {
        return bankMapValue;
    }
    public void setBankMapValue(Map<String, String> bankMapValue) {
        this.bankMapValue = bankMapValue;
    }
    public Map<String, String> getMapValue() {
        return mapValue;
    }
    public void setMapValue(Map<String, String> mapValue) {
        this.mapValue = mapValue;
    }
    public Map<String, String> getMainMapValue() {
        return mainMapValue;
    }
    public void setMainMapValue(Map<String, String> mainMapValue) {
        this.mainMapValue = mainMapValue;
    }
    public String getBranchCode() {
        return branchCode;
    }
    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }
    public String getBranchName() {
        return branchName;
    }
    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }
    public String getBankCode() {
        return bankCode;
    }
    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getBankName() {
        return bankName;
    }
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
    public String getAccountNo() {
        return accountNo;
    }
    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }
    public String getAccountTitle() {
        return accountTitle;
    }
    public void setAccountTitle(String accountTittle) {
        this.accountTitle = accountTittle;
    }
    public String getMobileNo() {
        return mobileNo;
    }
    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }
}
