package com.example.question5;

import java.util.List;

public interface FixedDepositAccountService {
    FixedDepositAccount addAccount(FixedDepositAccount fixedDepositAccount);

    FixedDepositAccount modifyAccount(int id, FixedDepositAccount fixedDepositAccount);

    void removeAccount(int id);

    FixedDepositAccount getAccountById(int id);

    List<FixedDepositAccount> getAllAccounts();

}
