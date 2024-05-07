package com.SystemDesignRound.SystemDesignRound.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "login")
@Data
public class LoginEntity {
    @Id
    private String username;
    private String password;
}
