package com.tejnal.bankapp.springbankapp.service;

import com.tejnal.bankapp.springbankapp.domain.entity.CustomerAccount;
import com.tejnal.bankapp.springbankapp.domain.entity.Deposits;
import com.tejnal.bankapp.springbankapp.domain.entity.User;
import com.tejnal.bankapp.springbankapp.domain.entity.Withdrawals;
import com.tejnal.bankapp.springbankapp.resources.UserCreateForm;


import java.util.List;
import java.util.Optional;

/**
 * @project spring-bank-app
 * @autor tejnal on 2020-01-12
 */
public interface UserService {

    Optional<com.tejnal.bankapp.springbankapp.domain.entity.User> findUserByUsername(String username);
    Optional<User> findUserByEmail(String email);
    List<CustomerAccount> findCustomerAccountById(long id);
    List<Withdrawals> findTransactionsByCustomerAccountId(long id);
    User registerUser(UserCreateForm userCreateForm);
    boolean hasValidPassword(User user, String pwd);
    List<Deposits> findTransactionsByAccountId(long id);
}
