package com.tejnal.bankapp.springbankapp.resources;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.validator.constraints.Length;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotEmpty;

/**
 * @project spring-bank-app
 * @autor tejnal on 2020-01-12
 */

@Component
@Setter
@Getter
@Slf4j
public class UserCreateForm {

    @NotEmpty
    @Length(min= 2, max=50)
    private String username;

    @NotEmpty
    private String password;

    @NotEmpty
    private String passwordConfirm;

    @NotEmpty
    @Length(min=2 , max= 50)
    private String email;


}
