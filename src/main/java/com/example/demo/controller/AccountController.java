package com.example.demo.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.security.Principal;

@Controller
public class AccountController {

    @PostMapping("/send-money")
    @ResponseBody
    String sendMoney(SendMoneyForm sendMoneyForm, Principal principal, Authentication authentication) {
//        System.out.println(principal.getName());
//        System.out.println(authentication.getAuthorities());
//        SecurityContextHolder.getContext().getAuthentication();
//        UserDetails userDetails = (UserDetails) principal;
        System.out.println("Sending money...");
        return "Money " + sendMoneyForm.getAmount() + " send to: " + sendMoneyForm.getTo();
    }
}
