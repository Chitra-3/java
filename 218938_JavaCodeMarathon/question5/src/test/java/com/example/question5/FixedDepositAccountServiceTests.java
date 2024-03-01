package com.example.question5;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class FixedDepositAccountServiceTests {
    @Autowired
    FixedDepositAccountService fixedDepositAccountService;

    @Test
    public void addAccountTest() {
        FixedDepositAccount fixedDepositAccount = new FixedDepositAccount(1, "Ram", 20000);
        fixedDepositAccountService.addAccount(fixedDepositAccount);
    }

    @Test
    public void getAllAccountsTest() {
        List<FixedDepositAccount> fixedDepositAccounts = fixedDepositAccountService.getAllAccounts();
        for (FixedDepositAccount fixedDepositAccount : fixedDepositAccounts) {
            System.out.println(" Account: " + fixedDepositAccount);
        }
    }

    @Test
    public void getAccountByIdTest() {
        FixedDepositAccount fixedDepositAccount = fixedDepositAccountService.getAccountById(1);
        System.out.println("Account:" + fixedDepositAccount);
    }

    @Test
    public void removeAccountTest() {
        fixedDepositAccountService.removeAccount(1);
    }

    @Test
    public void modifyAccountTest() {
        FixedDepositAccount fixedDepositAccount = fixedDepositAccountService.modifyAccount(2,
                new FixedDepositAccount(3, "Raju", 25000));
        System.out.println("Account:" + fixedDepositAccount);
    }
}
