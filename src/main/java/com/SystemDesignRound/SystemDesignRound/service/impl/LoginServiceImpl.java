package com.SystemDesignRound.SystemDesignRound.service.impl;

import com.SystemDesignRound.SystemDesignRound.entity.LoginEntity;
import com.SystemDesignRound.SystemDesignRound.repository.LoginRepository;
import com.SystemDesignRound.SystemDesignRound.repository.TokenRepository;
import com.SystemDesignRound.SystemDesignRound.service.LoginService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@NoArgsConstructor
@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginRepository loginRepository;

    @Autowired
    private TokenRepository tokenRepository;


    public Integer verifyCredentials(LoginEntity loginEntity) {
        Integer count = loginRepository.isCorrect(loginEntity.getUsername(),loginEntity.getPassword());
        if(count==1) return getToken(loginEntity.getUsername());
        return null;
    }


    public Integer getToken(String username) {
        try{
            return  tokenRepository.getToken(username);
        }
        catch (Exception e) {
            throw new NullPointerException("Token is not present in database");
        }
    }

    @Override
    public Boolean verifyToken(String username, Integer token) {

        if(tokenRepository.validateToken(username,token)==1)
        {
            return true;
        }
        return false;
    }
}
