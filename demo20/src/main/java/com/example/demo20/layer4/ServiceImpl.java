package com.example.demo20.layer4;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo20.layer2.Account;
import com.example.demo20.layer3.AccountRepository;

@Service
public class ServiceImpl implements AccountService{
    
    @Autowired
    AccountRepository accountRepository;
    @Override
    public Account addAccount(Account account) {
       return accountRepository.save(account);
    }
    @Override
    public Account modifyAccount(int id ,Account updatedAccount) {
        Account account=accountRepository.findById(id);
       if(updatedAccount.getAcHolder()!=null){
        account.setAcHolder(updatedAccount.getAcHolder()); 
       }
       if(updatedAccount.getAcBal()!=0.0){
        account.setAcBal(updatedAccount.getAcBal()); 
       }
       return accountRepository.save(account);
    }
    @Override
    public void removeAccount(int id) {
        accountRepository.deleteById(id);
    }
    @Override
    public Account getAccountById(int id) {
       return accountRepository.findById(id);
    }
    @Override
    public List<Account> getAllAccounts() {
       return accountRepository.findAll();
    }

    
    
}
