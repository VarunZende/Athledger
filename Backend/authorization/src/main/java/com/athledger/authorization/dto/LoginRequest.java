package com.athledger.authorization.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginRequest {

    String userName;
    String password;
}
