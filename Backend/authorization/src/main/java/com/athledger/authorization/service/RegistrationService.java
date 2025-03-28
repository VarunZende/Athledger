package com.athledger.authorization.service;

import com.athledger.authorization.dto.LoginResponse;
import com.athledger.authorization.dto.RegistrationRequest;
import com.athledger.authorization.dto.RegistrationResponse;
import com.athledger.authorization.impl.PasswordManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationService {

    @Autowired
    private PasswordManager passwordManager;

    @PostMapping("/register")
    public ResponseEntity<RegistrationResponse> register(@RequestBody RegistrationRequest registrationRequest) {
        try{

        } catch(Exception e){
            return ResponseEntity.status(500).body(new RegistrationResponse());
        }
        return ResponseEntity.ok(new RegistrationResponse());
    }
}
