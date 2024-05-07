package com.SystemDesignRound.SystemDesignRound.service;
import com.SystemDesignRound.SystemDesignRound.entity.LoginEntity;
public interface LoginService {

    public Integer verifyCredentials(LoginEntity loginEntity);
    public Integer getToken(String username);

    public Boolean verifyToken(String username,Integer token);
}
