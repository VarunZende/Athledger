package com.athledger.authorization.controller;

import com.athledger.authorization.dto.RegistrationRequest;
import com.athledger.authorization.dto.RegistrationResponse;
import com.athledger.authorization.impl.PasswordManager;
import com.athledger.authorization.impl.UserManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;

@RestController
public class RegistrationService {

    @Autowired
    private PasswordManager passwordManager;

    @Autowired
    UserManager userManager;

    @PostMapping("/auth/register")
    public ResponseEntity<?> register(@RequestBody RegistrationRequest registrationRequest) {
        try{
           userManager.register(registrationRequest);
            return ResponseEntity.ok(Collections.singletonMap("status", "User Successfuly created"));
        } catch(Exception e){
            return ResponseEntity.status(500).body(new RegistrationResponse());
        }
        //return ResponseEntity.ok(new RegistrationResponse());
    }
}
