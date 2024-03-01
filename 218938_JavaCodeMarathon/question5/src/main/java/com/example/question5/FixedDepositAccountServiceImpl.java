package com.example.question5;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FixedDepositAccountServiceImpl implements FixedDepositAccountService {

   @Autowired
   FixedDepositAccountRepository fixedDepositAccountRepository;

   @Override
   public FixedDepositAccount addAccount(FixedDepositAccount fixedDepositAccount) {
      return fixedDepositAccountRepository.save(fixedDepositAccount);
   }

   @Override
   public FixedDepositAccount modifyAccount(int id, FixedDepositAccount updatedAccount) {
      FixedDepositAccount fixedDepositAccount = fixedDepositAccountRepository.findById(id);
      if (updatedAccount.getAcHolder() != null) {
         fixedDepositAccount.setAcHolder(updatedAccount.getAcHolder());
      }
      if (updatedAccount.getAcBal() != 0.0) {
         fixedDepositAccount.setAcBal(updatedAccount.getAcBal());
      }
      return fixedDepositAccountRepository.save(fixedDepositAccount);
   }

   @Override
   public void removeAccount(int id) {
      fixedDepositAccountRepository.deleteById(id);
   }

   @Override
   public FixedDepositAccount getAccountById(int id) {
      return fixedDepositAccountRepository.findById(id);
   }

   @Override
   public List<FixedDepositAccount> getAllAccounts() {
      return fixedDepositAccountRepository.findAll();
   }

}
