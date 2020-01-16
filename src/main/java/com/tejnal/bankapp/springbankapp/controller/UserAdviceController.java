package com.tejnal.bankapp.springbankapp.controller;

import com.tejnal.bankapp.springbankapp.authorisation.CustomUserDetails;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

/**
 * @project spring-bank-app
 * @autor tejnal on 2020-01-16
 */
@ControllerAdvice
public class UserAdviceController {

    @ModelAttribute("currentUser")
    public CustomUserDetails getCurrentUser(
            @AuthenticationPrincipal CustomUserDetails customUserDetails) {
        return customUserDetails;
    }
}
