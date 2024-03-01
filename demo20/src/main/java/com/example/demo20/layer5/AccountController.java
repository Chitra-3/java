package com.example.demo20.layer5;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo20.layer2.Account;
import com.example.demo20.layer4.AccountService;

@RestController
public class AccountController {
    @Autowired
    AccountService accountService;

    @PostMapping("/addAccount")
     public Account addAccount(@RequestBody Account account) {
       return accountService.addAccount(account);
    }

    @PutMapping("/updateAccounts/{id}")
    public Account modifyAccount(@PathVariable int id , @RequestBody Account account) {
        return accountService.modifyAccount(id,account);
}

@DeleteMapping("/deleteAccount/{id}")
public void removeAccount(@PathVariable int id) {
    accountService.removeAccount(id);
}

@GetMapping("/get/{id}")
public Account getAccountById(@PathVariable int id) {
    return accountService.getAccountById(id);
 }

@GetMapping("/getAllAccounts")
 public List<Account> getAllAccounts() {
    return accountService.getAllAccounts();
 }
}