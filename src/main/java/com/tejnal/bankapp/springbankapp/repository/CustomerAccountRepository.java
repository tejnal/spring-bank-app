package com.tejnal.bankapp.springbankapp.repository;

import com.tejnal.bankapp.springbankapp.domain.entity.CustomerAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @project spring-bank-app
 * @autor tejnal on 2020-01-12
 */
@Repository
public interface CustomerAccountRepository extends JpaRepository<CustomerAccount, Long> {

    List<CustomerAccount> findCustomerAccountsByUserId(long id);

    CustomerAccount findCustomerAccountById(long id);

}
