package com.example.demo20.layer4;

import java.util.List;

import com.example.demo20.layer2.Account;

public interface AccountService {
    Account addAccount(Account account);
    Account modifyAccount(int id ,Account account);
    void removeAccount(int id);
    Account getAccountById(int id);
    List <Account> getAllAccounts();

}
