package com.example.question5;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class FixedDepositAccountRepositoryTests {
    @Autowired
    FixedDepositAccountRepository fixedDepositAccountRepository;

    @Test
    public void addAccountTest() {
        FixedDepositAccount fixedDepositAccount = new FixedDepositAccount(4, "Gita", 70000);
        fixedDepositAccountRepository.save(fixedDepositAccount);
    }

    @Test
    public void getAllAccountsTest() {
        List<FixedDepositAccount> fixedDepositAccounts = fixedDepositAccountRepository.findAll();
        for (FixedDepositAccount fixedDepositAccount : fixedDepositAccounts) {
            System.out.println(" Account: " + fixedDepositAccount);
        }
    }

    @Test
    public void getAccountByIdTest() {
        FixedDepositAccount fixedDepositAccount = fixedDepositAccountRepository.findById(1);
        System.out.println("Account:" + fixedDepositAccount);
    }

    @Test
    public void removeAccountTest() {
        fixedDepositAccountRepository.deleteById(1);
    }

}
