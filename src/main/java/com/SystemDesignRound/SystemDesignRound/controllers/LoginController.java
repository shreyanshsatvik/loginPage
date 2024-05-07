package com.SystemDesignRound.SystemDesignRound.controllers;

import com.SystemDesignRound.SystemDesignRound.entity.TokenEntity;
import com.SystemDesignRound.SystemDesignRound.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.SystemDesignRound.SystemDesignRound.entity.LoginEntity;

@RequestMapping("/api")
@RestController
public class LoginController {

    @Autowired
    LoginService loginService;


    @PostMapping("/login")
    public Integer login(@RequestBody LoginEntity loginEntity )
    {
        return loginService.verifyCredentials(loginEntity);
    }

    @PostMapping("/validateToken")
    public Boolean validateToken(@RequestBody TokenEntity tokenEntity)
    {
        return loginService.verifyToken(tokenEntity.getUsername(), tokenEntity.getToken());
    }

}
