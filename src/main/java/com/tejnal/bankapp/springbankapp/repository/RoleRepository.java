package com.tejnal.bankapp.springbankapp.repository;

import com.tejnal.bankapp.springbankapp.domain.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @project spring-bank-app
 * @autor tejnal on 2020-01-12
 */
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByRoleName(String roleName);
}
