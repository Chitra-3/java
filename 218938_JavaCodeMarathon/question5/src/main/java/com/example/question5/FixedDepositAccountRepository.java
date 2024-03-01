package com.example.question5;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface FixedDepositAccountRepository extends CrudRepository<FixedDepositAccount, Integer> {
   FixedDepositAccount findById(int id);

   List<FixedDepositAccount> findAll();

}
