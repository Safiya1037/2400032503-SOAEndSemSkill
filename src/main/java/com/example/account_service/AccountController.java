
package com.example.accountservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/internal/accounts")
public class AccountController {

    @GetMapping
    public String getAccounts() {
        return "Account Service Working!";
    }
}
