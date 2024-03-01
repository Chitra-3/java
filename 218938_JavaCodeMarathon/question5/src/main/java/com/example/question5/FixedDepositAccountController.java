package com.example.question5;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FixedDepositAccountController {
    @Autowired
    FixedDepositAccountService fixedDepositAccountService;

    @PostMapping("/addAccount")
    public FixedDepositAccount addAccount(@RequestBody FixedDepositAccount fixedDepositAccount) {
        return fixedDepositAccountService.addAccount(fixedDepositAccount);
    }

    @PutMapping("/updateAccounts/{id}")
    public FixedDepositAccount modifyAccount(@PathVariable int id, @RequestBody FixedDepositAccount fixedDepositAccount) {
        return fixedDepositAccountService.modifyAccount(id, fixedDepositAccount);
    }

    @DeleteMapping("/deleteAccount/{id}")
    public void removeAccount(@PathVariable int id) {
        fixedDepositAccountService.removeAccount(id);
    }

    @GetMapping("/get/{id}")
    public FixedDepositAccount getAccountById(@PathVariable int id) {
        return fixedDepositAccountService.getAccountById(id);
    }

    @GetMapping("/getAllAccounts")
    public List<FixedDepositAccount> getAllAccounts() {
        return fixedDepositAccountService.getAllAccounts();
    }
}