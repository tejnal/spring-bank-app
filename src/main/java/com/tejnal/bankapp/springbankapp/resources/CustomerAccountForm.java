package com.tejnal.bankapp.springbankapp.resources;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotEmpty;

/**
 * @project spring-bank-app
 * @autor tejnal on 2020-01-13
 */
@Component
@Getter
@Setter
@Slf4j
public class CustomerAccountForm {

    @NotEmpty
    @DecimalMin("0.00")
    @DecimalMax("99999999999.00")
    private double customerAccountBalance;

    @NotEmpty
    private String currency;



}
