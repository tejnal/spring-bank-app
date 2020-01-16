package com.tejnal.bankapp.springbankapp.service;

import com.tejnal.bankapp.springbankapp.domain.entity.*;
import com.tejnal.bankapp.springbankapp.repository.*;
import com.tejnal.bankapp.springbankapp.resources.UserCreateForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.*;

import static com.tejnal.bankapp.springbankapp.constants.GeneralConstants.ROLE_USER;

/**
 * @project spring-bank-app
 * @autor tejnal on 2020-01-12
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private  UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private WithdrawalRepository withdrawalRepository;

    @Autowired
    private DepositRepository depositRepository;

    @Autowired
    private CustomerAccountRepository customerAccountRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public Optional<User> findUserByUsername(String username) {
        return userRepository.findUserByUsername(username);
    }

    @Override
    public Optional<User> findUserByEmail(String email) {
        return userRepository.findUserByEmail(email);
    }

    @Override
    public List<CustomerAccount> findCustomerAccountById(long id) {
     return customerAccountRepository.findCustomerAccountsByUserId(id);
    }

    @Override
    public List<Deposits> findTransactionsByAccountId(long id) {
        return depositRepository.findTransactionsByCustomerAccountId(id);
    }

    @Override
    public List<Withdrawals> findTransactionsByCustomerAccountId(long id) {
        return withdrawalRepository.findTransactionsByCustomerAccountId(id);
    }

    @Override
    public User registerUser(UserCreateForm userCreateForm) {
        User user = new User();

        user.setUsername(userCreateForm.getUsername());
        user.setEmail(userCreateForm.getEmail());
        user.setPassword(passwordEncoder.encode(userCreateForm.getPassword()));

        Set<Role> roles = generateRolesSet();
        user.setRoles(roles);
        user.setCustomerAccounts(new ArrayList<>());

        return userRepository.save(user);
    }

    private Set<Role> generateRolesSet() {
        Role role = roleRepository.findByRoleName(ROLE_USER);
        Set<Role> roles = new HashSet<>();
        roles.add(role);
        return roles;

    }

    @Override
    public boolean hasValidPassword(User user, String pwd) {
        return passwordEncoder.matches(pwd, user.getPassword());
    }


}
