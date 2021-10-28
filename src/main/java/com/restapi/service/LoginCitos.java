package com.restapi.service;

import java.util.HashMap;
import java.util.Map;

import com.restapi.helper.BuildCofig;
import com.restapi.helper.Parameter;
import com.restapi.response.LoginResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service    
public class LoginCitos {

    @Autowired
    private RestTemplate restTemplate;

    public ResponseEntity<LoginResponse> Login(LoginResponse loginResponse){
        Parameter param = new Parameter();
        Map<String, String> params = new HashMap<>();
        params.put("email", param.getEmail());
        params.put("password", param.getPassword());
        params.put("service", "Login");
        params.put("appid", BuildCofig.APP_ID);
        LoginResponse result = restTemplate.postForObject(BuildCofig.MAIN_URL, params, LoginResponse.class);
        return ResponseEntity.ok(result);
    }

}
